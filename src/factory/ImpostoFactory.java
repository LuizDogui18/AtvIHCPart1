package factory;

import imposto.*;


public class ImpostoFactory {
    public static Imposto getImposto(TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return new ICMS();
            case PIS:
                return new PIS();
            case IPI:
                return new IPI();
            case ISS:
                return new ISS();
            default:
                throw new IllegalArgumentException("Tipo de imposto não reconhecido");
        }
    }
}
