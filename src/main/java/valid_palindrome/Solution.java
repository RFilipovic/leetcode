package valid_palindrome;

import java.util.Objects;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {

        if(s.isBlank()) return true;

        String secondPart = "";
        for(char c : s.toCharArray())
            if (Character.isLetter(c))
                secondPart = secondPart + Character.toLowerCase(c);
            else if(Character.isDigit(c))
                secondPart = secondPart + c;

        String firstPart = secondPart.substring(0, secondPart.length()/2);

        if(secondPart.length() % 2 == 1)
            secondPart = secondPart.substring((secondPart.length()/2) + 1);
        else
            secondPart = secondPart.substring(secondPart.length()/2);

        String reversed = new StringBuilder(firstPart).reverse().toString();

        return Objects.equals(secondPart, reversed);
    }

}
