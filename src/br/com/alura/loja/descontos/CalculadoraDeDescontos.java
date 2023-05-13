package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoOrcamentoSuperiorCincoItens(
                new DescontoOrcamentoValorSuperiorAQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
