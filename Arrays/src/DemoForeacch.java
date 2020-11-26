public class DemoForeacch {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for(String car: cars) {
            System.out.println(car);

            for(int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }
        }
    }
}
