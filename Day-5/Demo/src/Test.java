import java.util.*;
import java.util.function.Predicate;

public class Test{
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("New Delhi");
        cities.add("Kolkata");
        cities.add("Pune");

        //Util.printCitiesGreaterThan(cities, 5);
        //Util.printCitiesCharacter(cities, 'C');

        Condition c = (city)->city.length()>6;

        //while invoking printCitiesConditionally we are passing Fuction as a argument using lambda
        
        // Util.printCitiesConditionally(cities, c);

        Util.printCitiesConditionally(cities, city->city.startsWith("C"));

 
    }
}