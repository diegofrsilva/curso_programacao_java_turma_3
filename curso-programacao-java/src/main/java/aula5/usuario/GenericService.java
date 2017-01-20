package aula5.usuario;

import java.util.ArrayList;
import java.util.List;

public class GenericService<TIPO_DO_DADO> {

	public void salvar(TIPO_DO_DADO objeto) {
		System.out.println("Salvando o objeto... " + objeto);
	}

	public List<TIPO_DO_DADO> buscarTodos() {
		return new ArrayList<>();
	}
}
