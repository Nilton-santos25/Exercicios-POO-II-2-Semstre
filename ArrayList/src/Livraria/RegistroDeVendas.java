.package Livraria;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Marcio");

        LivroFisico fisico = new LivroFisico(autor) {
            fisico.setNome("Java");
            fisico.setValor(59.9);

        }
    }
}
