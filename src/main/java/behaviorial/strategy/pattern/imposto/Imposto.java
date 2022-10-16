package behaviorial.strategy.pattern.imposto;



import behaviorial.strategy.pattern.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
