import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> myNumbers = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0,"Opel"); // adicionar um elemento na lista
        cars.remove(0); //removendo um item de uma posicao especifico

        System.out.println(cars.get(0)); //chamando um elemento de determinada posicao de uma lista
        System.out.println(cars.size());

        //cars.clear(); //limpando o arraylist

        for(int i = 0; i <cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //ultilizando o foreach
        for (String car: cars) {
            System.out.println(cars);
        }

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (Integer numeros: myNumbers) {
            System.out.println(myNumbers);
        }
    }
}
