package jakarta.beans;

import java.util.Objects;

public class Livro {
	private Integer id;
	private String titulo;
	private Setor setor;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getTitulo() { return titulo; }
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public Setor getSetor() { return setor; }
	public void setSetor(Setor setor) { this.setor = setor; }
}