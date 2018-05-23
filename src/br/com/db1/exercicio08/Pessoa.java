package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

import br.com.db1.exercicio04.Telefone;
import br.com.db1.exercicio06.Endereco;

public class Pessoa {
	private String nome;
	
	private Date dataDeNscimento;
	
	private List<Telefone> telefones;
	
	private List<Endereco> enderecos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNscimento() {
		return dataDeNscimento;
	}

	public void setDataDeNscimento(Date dataDeNscimento) {
		this.dataDeNscimento = dataDeNscimento;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	
}
