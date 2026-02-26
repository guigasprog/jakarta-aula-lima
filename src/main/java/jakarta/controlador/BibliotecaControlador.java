package jakarta.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.beans.Setor;
import jakarta.beans.Livro;
import jakarta.beans.Biblioteca; // Adicione este import
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@SessionScoped
@Named
public class BibliotecaControlador implements Serializable {
    private static final long serialVersionUID = 1L;

    // ATRIBUTO FALTANTE:
    private Biblioteca novaBiblioteca = new Biblioteca();

    private List<Setor> setores = new ArrayList<>();
    private Setor setorSelecionado;
    private String nomeNovoSetor;
    private String tituloNovoLivro;
    private List<Livro> livros = new ArrayList<>();

    // MÉTODO PARA GRAVAR (usado no botão da tela de cadastro)
    public String gravar() {
        // Aqui você salvaria no DAO, por enquanto apenas limpa e volta
        this.novaBiblioteca = new Biblioteca(); 
        return "menuprincipal.xhtml?faces-redirect=true";
    }

    public void adicionarSetor() {
        if (nomeNovoSetor != null && !nomeNovoSetor.isEmpty()) {
            setores.add(new Setor(setores.size() + 1, nomeNovoSetor));
            nomeNovoSetor = "";
        }
    }

    public void selecionarSetor(Setor s) {
        this.setorSelecionado = s;
    }

    public void adicionarLivro() {
        if (setorSelecionado != null && tituloNovoLivro != null && !tituloNovoLivro.isEmpty()) {
            Livro novo = new Livro();
            novo.setId(livros.size() + 1);
            novo.setTitulo(tituloNovoLivro);
            novo.setSetor(setorSelecionado);
            livros.add(novo);
            tituloNovoLivro = "";
        }
    }

    // GETTERS E SETTERS OBRIGATÓRIOS PARA 'novaBiblioteca'
    public Biblioteca getNovaBiblioteca() {
        return novaBiblioteca;
    }

    public void setNovaBiblioteca(Biblioteca novaBiblioteca) {
        this.novaBiblioteca = novaBiblioteca;
    }

    // Outros getters e setters...
    public List<Setor> getSetores() { return setores; }
    public Setor getSetorSelecionado() { return setorSelecionado; }
    public String getNomeNovoSetor() { return nomeNovoSetor; }
    public void setNomeNovoSetor(String nomeNovoSetor) { this.nomeNovoSetor = nomeNovoSetor; }
    public String getTituloNovoLivro() { return tituloNovoLivro; }
    public void setTituloNovoLivro(String tituloNovoLivro) { this.tituloNovoLivro = tituloNovoLivro; }
    public List<Livro> getLivros() { return livros; }
}