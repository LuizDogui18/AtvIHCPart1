package model;

public class Produto {
    private String nome;
    private double preco;
    private String codigo;

    public Produto(String nome, double preco, String codigo) {

        this.nome = (nome.length() > 22) ? nome.substring(0, 22) : nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getPrecoFormatado() {
        return String.format("R$ %.2f", preco); // Formato da moeda brasileira
    }

    public String getCodigo() {
        return codigo;
    }
}