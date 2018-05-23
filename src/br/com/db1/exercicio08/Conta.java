package br.com.db1.exercicio08;

public class Conta {
	private Integer numero;
	private Integer codigoVerificador;
	private Agencia agencia;
	private Pessoa pessoa;
	
	public Conta(Agencia agencia, Pessoa pessoa){
		this.setAgencia(agencia);
		this.setPessoa(pessoa);
	}
	
	public void calcularDigitoVerificador(){
		
	}
	
	public Boolean validarCodigoVerificador(){
		return null;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(Integer codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
