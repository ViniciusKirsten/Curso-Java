package classe;

import java.util.Objects;

public class TesteEqualEHashcode {

	String nome;
	String email;
	
	/*
	 * isso foi algo gerado pelo eclipse
	 */
	
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TesteEqualEHashcode other = (TesteEqualEHashcode) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
}
