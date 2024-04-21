import java.util.Stack;

class Livro {
    String nome;
    String autor;
    String ISBN;
    int ano;

    public Livro(String nome, String autor, String ISBN, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Ano: " + ano);
    }
}

public class PilhaDeLivros {
    public static void main(String[] args) {
        Stack<Livro> pilhaDeLivros = new Stack<>();

        // Adicionando livros à pilha
        pilhaDeLivros.push(new Livro("Livro 1 - As Cronicas de Narnia", "Autor 1 - C.S.Lewis", "ISBN-1", 1950));
        pilhaDeLivros.push(new Livro("Livro 2 - O senhor dos Aneis", "Autor 2 - J.R.R.Tolkien", "ISBN-2", 1954));
        pilhaDeLivros.push(new Livro("Livro 3 - A Guerra dos Tronos", "Autor 3 - George R.R.Martin", "ISBN-3", 1996));

        // Imprimindo os atributos dos livros na pilha
        System.out.println("Livros na pilha:");
        for (Livro livro : pilhaDeLivros) {
            livro.imprimir();
            System.out.println();
        }

        // Mostrando a quantidade de livros na pilha
        System.out.println("Quantidade de livros na pilha: " + pilhaDeLivros.size());
    }
}
