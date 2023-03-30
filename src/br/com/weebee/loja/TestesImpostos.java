package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.imposto.CalculadoraDeImpostos;
import br.com.weebee.loja.imposto.ICMS;
import br.com.weebee.loja.imposto.ISS;
import br.com.weebee.loja.orcamento.Orcamento;

public class TestesImpostos {
	final static BigDecimal valor1 = new BigDecimal("150");

	//Strategy
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(valor1, 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println("ISS cobrado em cima de valor R$ " + valor1 + " = " + calculadora.calcular(orcamento, new ISS()));
		System.out.println("ICMS cobrado em cima de valor R$ " + valor1 + " = " + calculadora.calcular(orcamento, new ICMS()));

	}

}
