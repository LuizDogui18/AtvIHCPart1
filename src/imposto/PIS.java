package imposto;

import model.Produto;

public class PIS implements Imposto {
    private static final double ALIQUOTA = 0.0065;

    @Override
    public double calcular(Produto produto) {
        return produto.getPreco() * ALIQUOTA;
    }
}
