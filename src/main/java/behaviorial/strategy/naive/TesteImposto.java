package behaviorial.strategy.naive;

import behaviorial.strategy.naive.imposto.CalculadoraImposto;
import behaviorial.strategy.naive.imposto.TipoImposto;
import behaviorial.strategy.naive.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        System.out.println(calculadoraImposto.calcular(orcamento, TipoImposto.PIS));
    }
}
