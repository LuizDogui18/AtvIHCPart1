package imposto;


import model.Produto;

public class ICMS implements Imposto {
    private static final double ALIQUOTA = 0.18;

    @Override
    public double calcular(Produto produto) {
        return produto.getPreco() * ALIQUOTA;
    }
}