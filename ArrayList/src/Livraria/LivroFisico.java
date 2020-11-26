package Livraria;

public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro físico");
        System.out.println("Id " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("");
    }
}
