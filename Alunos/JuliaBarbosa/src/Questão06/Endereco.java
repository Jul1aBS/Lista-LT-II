package Questão06;


public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String cep;

    public Endereco(String rua, int numero, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + ", Nº: " + numero + ", Cidade: " + cidade + ", CEP: " + cep;
    }
}


