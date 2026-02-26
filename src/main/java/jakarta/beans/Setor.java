package jakarta.beans;

import java.util.Objects;

public class Setor {
	private Integer id;
	private String nome;
	private Biblioteca biblioteca;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Setor other = (Setor) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public Biblioteca getBiblioteca() { return biblioteca; }
	public void setBiblioteca(Biblioteca biblioteca) { this.biblioteca = biblioteca; }
}