package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoSuperiorCincoItens extends Desconto {

    public DescontoOrcamentoSuperiorCincoItens(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.1"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
