package imposto;

import model.Produto;

public class ISS implements Imposto {
    private static final double ALIQUOTA = 0.22;

    @Override
    public double calcular(Produto produto) {
        return produto.getPreco() * ALIQUOTA;
    }
}