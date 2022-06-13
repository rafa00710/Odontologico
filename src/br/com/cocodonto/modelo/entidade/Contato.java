package br.com.cocodonto.modelo.entidade;

import java.util.Objects;

public class Contato {
	private String email;
	private String celular;

	public Contato() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(celular, email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(celular, other.celular) && Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [email=")
		       .append(email)
		       .append(", celular=")
		       .append(celular)
		       .append("]");
		return builder.toString();
	}
}