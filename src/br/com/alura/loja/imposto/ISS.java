package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {
    public ISS(Imposto outroImposoto) {
        super(outroImposoto);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
