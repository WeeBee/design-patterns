package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.imposto.CalculadoraDeImpostos;
import br.com.weebee.loja.imposto.ICMS;
import br.com.weebee.loja.imposto.ISS;
import br.com.weebee.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
	}
}
