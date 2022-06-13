package br.com.cocodonto.modelo.entidade;

public enum sexoType {
	
	 M ("Masculino")
	,F ("Feminino");
	
	private String descricao;
	
	private sexoType(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	

}
