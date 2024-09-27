package model;

public class Produto {
    private String nome;
    private double preco;
    private boolean industrial; // Define se é industrial ou não
    private boolean servico;    // Define se é serviço

    public Produto(String nome, double preco, boolean industrial, boolean servico) {
        this.nome = nome;
        this.preco = preco;
        this.industrial = industrial;
        this.servico = servico;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getPrecoFormatado() {
        return String.format("R$ %.2f", preco);
    }

    public boolean isIndustrial() {
        return industrial;
    }

    public boolean isServico() {
        return servico;
    }
}