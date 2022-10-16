package behaviorial.strategy.pattern;


import behaviorial.strategy.pattern.imposto.CalculadoraImposto;
import behaviorial.strategy.pattern.imposto.impl.ISS;
import behaviorial.strategy.pattern.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        System.out.println(calculadoraImposto.calcular(orcamento, new ISS()));
    }
}
