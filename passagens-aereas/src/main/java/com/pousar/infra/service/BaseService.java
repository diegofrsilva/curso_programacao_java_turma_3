package com.pousar.infra.service;

import com.pousar.infra.csv.ArquivoCSV;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe base para as classes que gerenciam os cadastros no sistema.
 *
 * @param <T>
 */
public class BaseService<T extends Entidade> {

	private ArquivoCSV<T> arquivo;
	private Map<Long, T> dados;

	public BaseService() {
		this.dados = new HashMap<Long, T>();
	}

	public BaseService(ArquivoCSV<T> arquivo) {
		this();
		this.arquivo = arquivo;
		this.carregarTodosNaMemoria(arquivo.carregarTodos());
	}

	private void carregarTodosNaMemoria(Collection<T> dadosNoCSV) {
		for (T dadoNoCSV : dadosNoCSV) {
			dados.put(dadoNoCSV.getId(), dadoNoCSV);
		}
	}

	public T salvar(T entidade) {
		Long id = entidade.getId();
		if (id == null) {
			id = System.currentTimeMillis();
			entidade.setId(id);
		}
		dados.put(id, entidade);
		if (arquivo != null) {
			arquivo.salvarTodos(dados.values());
		}
		return entidade;
	}

	public T buscarPorId(Long id) {
		return dados.get(id);
	}

	public void remover(Long id) {
		dados.remove(id);
	}

	protected Collection<T> getTodosDados() {
		return dados.values();
	}
}