package com.dextraining.garagem;

import java.util.Collection;

/**
 * Interface que define o contrato para a implementacao da garagem.
 * 
 * @author java04
 *
 */
public interface Garagem {
	/**
	 * Metodo para adicionar um novo carro na garagem. Deve validar se a placa
	 * do carro esta duplicada.
	 * 
	 * @param carro
	 *            Carro a ser inserido.
	 * @return Retorna true se adicionou e false caso contrario.
	 */
	public boolean adicionar(Carro carro);

	/**
	 * Busca um carro pela sua placa.
	 * 
	 * @param placa
	 *            Placa a ser buscada
	 * @return Instancia do carro encontrado ou null.
	 */
	public Carro buscar(String placa);

	/**
	 * Vende um carro usando sua placa.
	 * 
	 * @param placa
	 *            A placa do carro a ser removido.
	 * @return Retorna true existe o carro com a placa e ele foi removido ou
	 *         false caso o contrario.
	 */
	public boolean vender(String placa);

	/**
	 * Retorna uma colecao com os carros cadastrados na garagem. O retorno deve
	 * estar ordenado por marca, modelo, ano e preco.
	 * 
	 * @return
	 */
	public Collection<Carro> getCarros();
}
