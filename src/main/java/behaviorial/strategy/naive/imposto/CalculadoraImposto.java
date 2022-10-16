package behaviorial.strategy.naive.imposto;

import behaviorial.strategy.naive.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case IPI:
                return orcamento.getValor().multiply(new BigDecimal("0.2"));
            case IRPF:
                return orcamento.getValor().multiply(new BigDecimal("0.3"));
            case IRPJ:
                return orcamento.getValor().multiply(new BigDecimal("0.4"));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.5"));
            case PIS:
                return orcamento.getValor().multiply(new BigDecimal("0.6"));
            default:
                return BigDecimal.ZERO;
        }
    }

}
