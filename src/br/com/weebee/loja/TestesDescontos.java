package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.desconto.CalculadoraDeDescontos;
import br.com.weebee.loja.orcamento.ItemOrcamento;
import br.com.weebee.loja.orcamento.Orcamento;

public class TestesDescontos {
	final static BigDecimal valor1 = new BigDecimal("200");
	final static BigDecimal valor2 = new BigDecimal("1000");
	final static BigDecimal valor3 = new BigDecimal("500");

	//Chain of Responsibility
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(valor1));
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(valor2));
		Orcamento terceiro = new Orcamento();
		terceiro.adicionarItem(new ItemOrcamento(valor3));

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println("desconto de R$ " + valor1 + " no primeiro = " + calculadora.calcular(primeiro));
		System.out.println("desconto de R$ " + valor2 + " no segundo = " + calculadora.calcular(segundo));
		System.out.println("desconto no terceiro: (R$ " + valor3 + ") = " + calculadora.calcular(terceiro));
	}

}
