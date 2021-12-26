package laboratirio2.dtos;

import laboratirio2.excecoes.DisciplinaInvalidaExeption;
public class DisciplinaDTO {

	private String nome;
	
	public DisciplinaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DisciplinaDTO(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinaDTO other = (DisciplinaDTO) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DisciplinaDTO [nome=" + nome + "]";
	}
	
public boolean ValidaDisciplina(DisciplinaDTO disciplina) {
	if (nome == null)
		throw new DisciplinaInvalidaExeption("Nome invalido","Nome da disciplina vazio prenecha o campo");
	return true;
}
	
}
