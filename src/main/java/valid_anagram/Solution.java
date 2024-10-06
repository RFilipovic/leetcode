package valid_anagram;

import java.util.HashMap;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : s.toCharArray()){
            if(map1.containsKey(c)){
                int count = map1.get(c);
                count++;
                map1.put(c,count);
            }else
                map1.put(c, 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : t.toCharArray()){
            if(map2.containsKey(c)){
                int count = map2.get(c);
                count++;
                map2.put(c,count);
            }else
                map2.put(c, 1);
        }

        for (char c : s.toCharArray())
            if (!Objects.equals(map1.get(c), map2.get(c))) return false;
        return true;
    }
}
