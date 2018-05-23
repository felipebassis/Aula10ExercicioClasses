package br.com.db1.exercicio07;

public class Olimpiada {
	private Integer ano;
	
	private Modalidade modalidade;
	
	private Pessoa pessoa;

	private Sede sede;
	
	public Olimpiada(Modalidade modalidade, Sede sede, Pessoa pessoa ){
		this.setModalidade(modalidade);
		this.setSede(sede);
		this.setPessoa(pessoa);
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
}
