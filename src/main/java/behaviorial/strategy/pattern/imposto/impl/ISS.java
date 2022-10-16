package behaviorial.strategy.pattern.imposto.impl;
import behaviorial.strategy.pattern.imposto.Imposto;
import behaviorial.strategy.pattern.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }
}
