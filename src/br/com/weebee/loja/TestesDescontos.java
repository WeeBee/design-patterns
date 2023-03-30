package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.desconto.CalculadoraDeDescontos;
import br.com.weebee.loja.orcamento.Orcamento;

public class TestesDescontos {
	final static BigDecimal valor1 = new BigDecimal("200");
	final static BigDecimal valor2 = new BigDecimal("1000");

	//Chain of Responsibility
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(valor1, 6);
		Orcamento segundo = new Orcamento(valor2, 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println("desconto em 6 itens de R$ " + valor1 + " = " + calculadora.calcular(primeiro));
		System.out.println("desconto em 1 item de R$ " + valor2 + " = " + calculadora.calcular(segundo));
	}

}
