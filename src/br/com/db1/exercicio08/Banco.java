package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

public class Banco {
	private String nome;
	private Date dataDeFundacao;
	private String publico;
	private List<Conta> contas;
	
	private Boolean isPublico(){
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeFundacao() {
		return dataDeFundacao;
	}

	public void setDataDeFundacao(Date dataDeFundacao) {
		this.dataDeFundacao = dataDeFundacao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
