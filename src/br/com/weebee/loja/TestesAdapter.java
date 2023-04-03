package br.com.weebee.loja;

import java.math.BigDecimal;

import br.com.weebee.loja.http.JavaHttpClient;
import br.com.weebee.loja.orcamento.ItemOrcamento;
import br.com.weebee.loja.orcamento.Orcamento;
import br.com.weebee.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
