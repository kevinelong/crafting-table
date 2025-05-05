import java.util.*;

public class Main {
    static HashMap<Set<String>,String> recipes = new HashMap<>();
    public static void main(String[] args) {
        recipes.put(Set.of("icecream", "cherry", "chocolate"), "SUNDAY");
        recipes.put(Set.of("icecream", "banana", "pineapple"), "BANANA-SPLIT");
        System.out.println(craftThing(Set.of("icecream", "chocolate", "cherry")));
        System.out.println(craftThing(Set.of("ice", "chocolate", "cherry")));
    }

    static String craftThing(Set<String> list) {
        if(recipes.containsKey(list)){
            return recipes.get(list);
        }
        return "NOPE";
    }

//    static makeSunday(String i, String ii, String iii) {
//
//    }
}