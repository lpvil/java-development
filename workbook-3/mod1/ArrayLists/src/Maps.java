import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> favoriteFruits = new HashMap<>();
        favoriteFruits.put("jesus", "watermelon");
        favoriteFruits.put("genald", "peach");
        favoriteFruits.put("shawn","apples");
        favoriteFruits.put("van", "durian");

        System.out.println("breakout rooms favorite fruits " + "\n" + favoriteFruits);
        }
    }
