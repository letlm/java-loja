package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximoDesconto;

     public Desconto(Desconto proximoDesconto){
         this.proximoDesconto = proximoDesconto;
     }
    public abstract BigDecimal calcular(Orcamento orcamento);

}
