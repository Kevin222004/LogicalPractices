package HashMapsAndTires.l1;

import java.util.HashMap;
import java.util.Map;

public class countThatHowMuchTimeACharaterCome {
    public static void main(String[] args) {
        String input = "thiruvananthapuram";
        System.out.println(countAllChar(input));
    }

    public static HashMap<Character, Integer> countAllChar(String input) {
        HashMap<Character, Integer> ans = new HashMap<>();
        for (int i= 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (ans.containsKey(c)) {
                ans.put(c, ans.get(c) + 1);
            } else {
                ans.put(c, 1);
            }
        }
        return ans;
    }
}
