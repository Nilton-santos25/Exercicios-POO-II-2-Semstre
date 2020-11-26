import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = entrada.nextLine();

        System.out.println("Digite seu telefone");
        String telefone = entrada.nextLine();

        ArrayList<String> saida = new ArrayList<String>();
        saida.add(name);
        saida.add(idade);
        saida.add(telefone);

        for(int i = 0; i<saida.size(); i++) {
            System.out.println("id: " + i);
            System.out.println(saida.get(i));
        }


    }
}
