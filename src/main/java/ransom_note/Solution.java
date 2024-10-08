package ransom_note;

import java.util.HashMap;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length() < ransomNote.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : ransomNote.toCharArray()){
            Integer count = 0;
            if(map1.containsKey(c)){
                count = map1.get(c);
                count++;
                map1.put(c,count);
            }else{
                map1.put(c,count);
            }
        }

        for (char c : magazine.toCharArray()){
            Integer count = 0;
            if(map2.containsKey(c)){
                count = map2.get(c);
                count++;
                map2.put(c,count);
            }else{
                map2.put(c,count);
            }
        }

        for (char c : ransomNote.toCharArray()){
            if(!map2.containsKey(c))
                return false;
            if(!(map1.get(c) <= map2.get(c)))
                return false;
        }
        return true;
    }
}