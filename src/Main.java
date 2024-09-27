import model.Produto;

import factory.ImpostoFactory;
import factory.TipoImposto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto Industrial 1", 100.0, true, false));  // Produto industrial
        produtos.add(new Produto("Produto Comum 1", 100.0, false, false));      // Produto não industrial
        produtos.add(new Produto("Serviço 1", 200.0, false, true));             // Serviço

        double totalImpostosProdutos = 0;
        double totalImpostosServicos = 0;
        double totalValorItens = 0;

        for (Produto produto : produtos) {
            double totalImpostos = 0;

            if (produto.isServico()) {
                // Aplicar imposto ISS se for um serviço
                totalImpostos += ImpostoFactory.getImposto(TipoImposto.ISS).calcular(produto);
                totalImpostosServicos += totalImpostos;
            } else {
                // Aplicar ICMS, PIS e IPI se for um produto
                totalImpostos += ImpostoFactory.getImposto(TipoImposto.ICMS).calcular(produto);
                totalImpostos += ImpostoFactory.getImposto(TipoImposto.PIS).calcular(produto);
                totalImpostos += ImpostoFactory.getImposto(TipoImposto.IPI).calcular(produto);
                totalImpostosProdutos += totalImpostos;
            }

            totalValorItens += produto.getPreco();
            System.out.println("Item: " + produto.getNome());
            System.out.println("Preço: " + produto.getPrecoFormatado());
            System.out.println("Total Impostos: R$ " + String.format("%.2f", totalImpostos));
            System.out.println();
        }

        System.out.println("Total valor dos itens: R$ " + String.format("%.2f", totalValorItens));
        System.out.println("Total impostos sobre produtos: R$ " + String.format("%.2f", totalImpostosProdutos));
        System.out.println("Total impostos sobre serviços: R$ " + String.format("%.2f", totalImpostosServicos));
    }
}