import java.util.*;

public class Main {
    static HashMap<String,String> recipes = new HashMap<>();
    public static void main(String[] args) {
        recipes.put("icecream-chocolate-cherry", "SUNDAY");
        recipes.put("icecream-banana-pineapple", "BANANA-SPLIT");

        List<String> items = List.of("icecream", "chocolate", "cherry");
        System.out.println(craftThing(items));

        List<String> items2 = List.of("ice", "chocolate", "cherry");
        System.out.println(craftThing(items2));

    }

    static String craftThing(List<String> list) {
        String mashed = String.join("-", list);
        System.out.println(mashed);
        if(recipes.containsKey(mashed)){
            return recipes.get(mashed);
        }
        return "NOPE";
    }

//    static makeSunday(String i, String ii, String iii) {
//
//    }
}