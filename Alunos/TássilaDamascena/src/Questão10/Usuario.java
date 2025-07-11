
package Questão10;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected String id;
    protected List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public abstract boolean podeEmprestar();

    public int getQtLivrosEmprestados() {
        return livrosEmprestados.size();
    }

    @Override
    public String toString() {
        return nome + " (" + id + ") - livros emprestados: " + getQtLivrosEmprestados();
    }
}
