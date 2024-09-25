package imposto;

public class ISS implements Imposto {
    @Override
    public double calcular(Item item) {
        if (item instanceof Servico) {
            return item.getValor() * 0.22; // 22% de imposto ISS
        }
        return 0;
    }
}