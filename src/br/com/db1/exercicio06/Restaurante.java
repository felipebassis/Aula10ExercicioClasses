package br.com.db1.exercicio06;

import java.util.Date;
import java.util.List;

import br.com.db1.exercicio04.Telefone;

public class Restaurante {
	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	private List<Telefone> telefone;
	private List<Pedido> pedido;
	private Endereco endereco;
	
	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
		
	}
}
