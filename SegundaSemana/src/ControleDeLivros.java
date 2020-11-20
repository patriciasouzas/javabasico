import java.util.Scanner;

public class ControleDeLivros {

	public static Livro editarRegistroDeLivro(Livro livro, Scanner sc) {
		int opcaoEdicao = 0;
		if (livro != null) {
			do {
				opcaoEdicao = Leitor.lerValor("Qual informa��o voc� deseja editar?"
						+ "\n1) Nome\n2) Autor\n3) Classifica��o\n4) Editora\n" + "5) Ano de publica��o\n", sc,
						opcaoEdicao);
				switch (opcaoEdicao) {
				case 0:
					System.out.println("Saindo da edi��o..");
					break;
				case 1:
					livro.setNome(Leitor.lerValor("Qual o nome do livro ? ", sc));
					System.out.println("Nome editado com sucesso!");
					break;
				case 2:
					livro.setAutor(Leitor.lerValor("Qual o autor ? ", sc));
					System.out.println("Autor editado com sucesso!");
					break;
				case 3:
					livro.setClassificacao(Leitor.lerValor("Qual a classifica��o ? ", sc, livro.getClassificacao()));
					System.out.println("Classifica��o editada com sucesso!");
					break;
				case 4:
					livro.setEditora(Leitor.lerValor("Qual a editora ? ", sc));
					System.out.println("Editora editada com sucesso!");
					break;
				case 5:
					livro.setAnoDePublicacao(
							Leitor.lerValor("Qual o ano de publica��o ? ", sc, livro.getAnoDePublicacao()));
					System.out.println("Ano de publica��o editado com sucesso!");
					break;
				default:
					break;
				}
			} while (opcaoEdicao != 0);

		} else {
			System.out.println("N�o existe registro com esse Nr�!");
		}
		return livro;
	}

	public static Livro criarRegistroDeLivro(Livro livro, Scanner sc) {
		if (livro == null) {
			livro = new Livro();
			livro.setNome(Leitor.lerValor("Qual o nome do livro ? ", sc));
			livro.setAutor(Leitor.lerValor("Qual o autor ? ", sc));
			livro.setClassificacao(Leitor.lerValor("Qual a classifica��o ? ", sc, livro.getClassificacao()));
			livro.setEditora(Leitor.lerValor("Qual a editora ? ", sc));
			livro.setAnoDePublicacao(Leitor.lerValor("Qual o ano de publica��o ? ", sc, livro.getAnoDePublicacao()));
		} else {
			System.out.println("J� existe um registro com esse Nr�!");
		}
		return livro;
	}

	public static void imprimirLivros(Livro[] livros) {
		Boolean verificaSeTemValor = false;
		for (Livro l : livros) {
			if (l != null) {
				verificaSeTemValor = true;
				System.out.printf("Nome: %s\nAutor: %s\nAno de Publica��o: %d\nClassifica��o: %d\nEditora: %s\n",
						l.getNome(), l.getAutor(), l.getAnoDePublicacao(), l.getClassificacao(), l.getEditora());
				System.out.println("--------------------------");
			}
		}
		if (!verificaSeTemValor) {
			System.out.println("Nenhum livro Cadastrado!");
		}
	}

	public static void imprimirRegistro(Livro l) {

		if (l != null) {
			System.out.printf("Nome: %s\nAutor: %s\nAno de Publica��o: %d\nClassifica��o:"
					+ " %d\nEditora: %s\n",
					l.getNome(), l.getAutor(), l.getAnoDePublicacao(), l.getClassificacao(), 
					l.getEditora());
			System.out.println("--------------------------");
		} else {
			System.out.println("Nenhum livro Cadastrado!");
		}
	}

	public static Livro deletarRegistro(Livro livro) {
		if(livro != null) {
			System.out.println("Registro deletado com sucesso!");
		}else {
			System.out.println("N�o existe registro!");
		}
		return null;
	}
}