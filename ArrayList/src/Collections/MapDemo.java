package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.size());
        //capitalCities.remove("England");
        //capitalCities.clear();

        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + "value: " + capitalCities.get(i));
        }
    }
}
