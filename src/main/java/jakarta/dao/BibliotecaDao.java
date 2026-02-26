package jakarta.dao;

import java.util.ArrayList;
import java.util.List;
import jakarta.beans.Biblioteca;

public class BibliotecaDao {
	private static List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

	public void cadastrar(Biblioteca b) {
		bibliotecas.add(b);
	}

	public List<Biblioteca> pesquisar() {
		return bibliotecas;
	}

	public void remover(Biblioteca b) {
		bibliotecas.remove(b);
	}
}