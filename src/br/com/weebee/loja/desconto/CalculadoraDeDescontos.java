package br.com.weebee.loja.desconto;

import java.math.BigDecimal;

import br.com.weebee.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
