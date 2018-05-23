package br.com.db1.exercicio06;

public class Endereco {
	private TipoLogradouro tipoLogradouro;
	
	private Integer cep;
	
	public String exibirCepFormatado(){
		return null;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
}
