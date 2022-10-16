package behaviorial.strategy.pattern.imposto;



import behaviorial.strategy.pattern.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
