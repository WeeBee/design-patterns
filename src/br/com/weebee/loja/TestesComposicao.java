package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.orcamento.ItemOrcamento;
import br.com.weebee.loja.orcamento.Orcamento;

public class TestesComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		System.out.println(novo.getValor());
	}
}
