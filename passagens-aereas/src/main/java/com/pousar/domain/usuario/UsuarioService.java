package com.pousar.domain.usuario;

import com.pousar.infra.util.Strings;
import com.pousar.domain.ValidacaoException;
import com.pousar.infra.csv.ArquivoCSV;
import com.pousar.infra.service.BaseService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Servico para manipular usuarios do sistema.
 */
public class UsuarioService extends BaseService<Usuario> {

    public static final String CAMINHO_ARQUIVO = System.getProperty("user.home") + "/usuarios.csv";

    public UsuarioService() {
        super(new ArquivoCSV<>(CAMINHO_ARQUIVO, new UsuarioToCSVConverter()));
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        if (Strings.isEmpty(usuario.getNome())) {
            throw new ValidacaoException("Nome eh obrigatorio");
        }
        if (Strings.isEmpty(usuario.getEmail())) {
            throw new ValidacaoException("Email eh obrigatorio");
        }
        if (Strings.isEmpty(usuario.getSenha())) {
            throw new ValidacaoException("Senha eh obrigatorio");
        }
        Usuario usuarioEncontrado = buscarPorEmail(usuario.getEmail());
        if (usuarioEncontrado != null) {
            if (!usuarioEncontrado.getId().equals(usuario.getId())) {
                throw new ValidacaoException("Email jah cadastrado");
            }
        }
        return super.salvar(usuario);
    }

    public Usuario buscarParaLogin(String email, String senha) {
        Usuario usuario = buscarPorEmail(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }

    public Usuario buscarPorEmail(String email) {
        for (Usuario usuario : getTodosDados()) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> buscarPor(String email, String nome) {
        List<Usuario> resultados = new ArrayList<>(getTodosDados());
        filtrarPorEmail(email, resultados);
        filtrarPorNome(nome, resultados);
        return resultados;
    }

    private void filtrarPorEmail(String email, List<Usuario> usuarios) {
        if (Strings.isNotEmpty(email)) {
            Iterator<Usuario> iterator = usuarios.iterator();
            while (iterator.hasNext()) {
                Usuario usuario = iterator.next();
                boolean contains = usuario
                        .getEmail()
                        .toUpperCase()
                        .contains(email.toUpperCase());

                if (!contains) {
                    iterator.remove();
                }
            }
        }
    }

    private void filtrarPorNome(String nome, List<Usuario> usuarios) {
        if (Strings.isNotEmpty(nome)) {
            Iterator<Usuario> iterator = usuarios.iterator();
            while (iterator.hasNext()) {
                Usuario usuario = iterator.next();
                boolean contains = usuario
                        .getNome()
                        .toUpperCase()
                        .contains(nome.toUpperCase());

                if (!contains) {
                    iterator.remove();
                }
            }
        }
    }
}
