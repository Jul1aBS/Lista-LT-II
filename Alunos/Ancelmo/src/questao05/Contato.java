package questao05;

import java.util.Objects;

public class Contato {
    private String nome;
    private String email;
    private String numero;


    public Contato(String nome, String email, String numero) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    public Contato() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
             "\nE-mail: " + email +
             "\nNumero: " + numero + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;

        Contato contato = (Contato) o;
        return this.email.equals(contato.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(email); 
    }
    
}
