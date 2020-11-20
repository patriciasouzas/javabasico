public class Livro {
	
	private Integer anoDePublicacao;
	private String nome;
	private String autor;
	private String editora;
	private Integer classificacao;

	public Livro() {

	}

	public Livro(Integer anoDePublicacao, String nome, String autor, String editora, Integer classificacao) {
		this.anoDePublicacao = anoDePublicacao;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.classificacao = classificacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}