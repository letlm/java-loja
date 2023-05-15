package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
    private Imposto outroImposoto;

    public Imposto(Imposto outroImposoto) {
        this.outroImposoto = outroImposoto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);

        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if(outroImposoto != null){
            valorOutroImposto = outroImposoto.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }


}
