package br.com.weebee.loja.imposto;

import java.math.BigDecimal;

import br.com.weebee.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
