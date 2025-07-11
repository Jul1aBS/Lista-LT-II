package Exercicio09;

/**
 *
 * @author Fernanda Santos
 */
public class Funcionario implements Imprimivel {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionario: " + nome + " | Cargo: " + cargo);
    }
}
