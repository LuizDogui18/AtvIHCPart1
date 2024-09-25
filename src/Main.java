import model.GeradorDeEtiqueta;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Coca-Cola 350ml", 5.50, "123456789012");

        GeradorDeEtiqueta gerador = new GeradorDeEtiqueta();
        String etiquetaZPL = gerador.gerarEtiqueta(produto);


        System.out.println(etiquetaZPL);
    }
}