package br.com.cocodonto.modelo.entidade;

import java.util.Objects;

public class Dentista {
	
	private int id;
	private String cro;
	private String nome;
	private String cpf;
	private String rg;
	
	private Endereco endereco;
	private Contato contato;
	
	
	
	public Dentista() {
		super();
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Dentista(int id, String cro, String nome, String cpf, String rg) {
		this(cro, nome, cpf, rg);
		this.id = id;
		
	}
	public Dentista(String cro, String nome, String cpf, String rg) {
		this();
		this.cro = cro;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, cro, id, nome, rg);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(cro, other.cro) && id == other.id
				&& Objects.equals(nome, other.nome) && Objects.equals(rg, other.rg);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dentista [id=").append(id).append(", cro=").append(cro).append(", nome=").append(nome)
				.append(", cpf=").append(cpf).append(", rg=").append(rg).append(", endereco=").append(endereco)
				.append(", contato=").append(contato).append("]");
		return builder.toString();
	} 
	
	

}
