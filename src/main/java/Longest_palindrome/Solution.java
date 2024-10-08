package Longest_palindrome;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            if(!map.containsKey(c))
                map.put(c, 1);
            else{
                int count = map.get(c);
                count++;
                map.put(c, count);
            }
        }

        int palindromeSize = 0;
        boolean hasOdd = false;
        for (char c : map.keySet()){
            int count = map.get(c);
            if(count % 2 == 0){
                palindromeSize += count;
            } else if (count % 2 == 1) {
                palindromeSize += count - 1;
                hasOdd = true;
            }
        }

        return hasOdd ? palindromeSize + 1 : palindromeSize;
    }

}
