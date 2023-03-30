package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.desconto.CalculadoraDeDescontos;
import br.com.weebee.loja.orcamento.Orcamento;

public class TestesDescontos {

	//Chain of Responsibility
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println("desconto com 6 itens de 200 = " + calculadora.calcular(primeiro));
		System.out.println("desconto com 1 item de 1000 = " + calculadora.calcular(segundo));
	}

}
