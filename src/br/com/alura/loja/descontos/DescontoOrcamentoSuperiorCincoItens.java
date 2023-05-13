package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoSuperiorCincoItens extends Desconto {

    public DescontoOrcamentoSuperiorCincoItens(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximoDesconto.calcular(orcamento);
    }
}
