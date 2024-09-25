package model;

public class GeradorDeEtiqueta {

    public String gerarEtiqueta(Produto produto) {

        String etiqueta = "^XA\n" +
                "^FO50,50^ADN,36,20^FD" + produto.getNome() + "^FS\n" +
                "^FO50,100^ADN,36,20^FD" + produto.getPrecoFormatado() + "^FS\n" +
                "^FO50,150^ADN,36,20^FD" + produto.getCodigo() + "^FS\n" +
                "^FO50,200^BY3\n" +
                "^BCN,100,Y,N,N\n" +
                "^FD" + produto.getCodigo() + "^FS\n" +
                "^XZ";

        return etiqueta;
    }
}
