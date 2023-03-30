package br.com.weebee.loja.imposto;
import java.math.BigDecimal;

import br.com.weebee.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
