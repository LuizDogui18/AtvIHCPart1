package imposto;

import model.Produto;

import model.Produto;

public class IPI implements Imposto {
    private static final double ALIQUOTA = 0.12;

    @Override
    public double calcular(Produto produto) {
        if (produto.isIndustrial()) {
            return produto.getPreco() * ALIQUOTA;
        }
        return 0;
    }
}