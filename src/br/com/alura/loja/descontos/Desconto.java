package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximoDesconto;

     public Desconto(Desconto proximoDesconto){
         this.proximoDesconto = proximoDesconto;
     }
    public BigDecimal calcular(Orcamento orcamento){
         if (deveAplicar(orcamento)){
             return efetuarCalculo(orcamento);
         }
         return proximoDesconto.calcular(orcamento);
    }
    protected  abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);

}
