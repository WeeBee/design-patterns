package br.com.weebee.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.weebee.loja.pedido.GeraPedido;
import br.com.weebee.loja.pedido.GeraPedidoHandler;
import br.com.weebee.loja.pedido.acao.EnviarEmailPedido;
import br.com.weebee.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Wilson Jr";
		BigDecimal valorOrcamento = new BigDecimal("700");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
				);
		handler.execute(gerador);
	}
}
