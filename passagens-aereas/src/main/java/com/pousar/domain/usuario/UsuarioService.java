package com.pousar.domain.usuario;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.pousar.domain.ValidacaoException;
import com.pousar.infra.csv.ArquivoCSV;
import com.pousar.infra.service.BaseService;
import com.pousar.infra.util.Strings;

/**
 * Servico para manipular usuarios do sistema.
 */
public class UsuarioService extends BaseService<Usuario> {

	public static final String NOME_ARQUIVO = "usuarios.csv";
	public static final String CAMINHO_ARQUIVO;

	static {
		String home = System.getProperty("user.home");
		CAMINHO_ARQUIVO = home + File.separator + NOME_ARQUIVO;
	}

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
		// TODO: Realizar validacao de email duplicado
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

		// TODO: filtar a lista de acordo com os valores informados.

		return resultados;
	}
}
