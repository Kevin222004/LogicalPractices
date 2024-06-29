package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Prob1116 {
}

class Solution {
    public int countCharacters(String[] words, String chars) {
        List<String> str = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0 ; i < words.length; i++) {
            for (int j = 0; j < chars.length(); j++) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (!hash.containsKey(chars.charAt(j))) {
                        if (chars.charAt(j) == words[i].charAt(k)) {
                            hash.put(String.valueOf(chars.charAt(j)), -1);
                            if (!str.contains(words[i])) {
                                str.add(words[i]);
                            }
                        }
                    }
                }
            }
        }
        int rotal = 0;
        for (int j = 0; j < str.size(); j++) {
            rotal = rotal + str.get(j).length();
        }
        return rotal;
    }
}
