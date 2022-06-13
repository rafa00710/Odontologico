
package br.com.cocodonto.modelo.entidade;

import java.util.Objects;

/**
 * @author rafael
 *
 */
public class Paciente {
	
	private long id;
	private String nome;
	private String rg;
	private String cpf;

	
	private sexoType sexo;
	
	
	private Endereco Endereco;
	
	private Contato Contato;

	public Paciente(long id, String nome, String rg, String cpf, sexoType sexo,
			br.com.cocodonto.modelo.entidade.Endereco endereco, br.com.cocodonto.modelo.entidade.Contato contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		Endereco = endereco;
		Contato = contato;
	}

	public Paciente(long id, String nome, String rg, String cpf, sexoType sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Paciente(String nome, String rg, String cpf, sexoType sexo) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public sexoType getSexo() {
		return sexo;
	}

	public void setSexo(sexoType sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}

	public Contato getContato() {
		return Contato;
	}

	public void setContato(Contato contato) {
		Contato = contato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, nome, rg, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(cpf, other.cpf) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(rg, other.rg) && sexo == other.sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [id=")
		       .append(id)
		       .append(", nome=")
		       .append(nome)
		       .append(", rg=")
		       .append(rg)
			   .append(", cpf=").append(cpf).append(", sexo=").append(sexo).append(", Endereco=").append(Endereco)
			   .append(", Contato=").append(Contato).append("]");
		return builder.toString();
	}
	
	
	
	
	
	


}
