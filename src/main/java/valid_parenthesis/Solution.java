package valid_parenthesis;

import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {

        String stack = "";

        while (!s.isEmpty()){
            String c = s.substring(0, 1);
            if(Objects.equals(c, "{")
                    || Objects.equals(c, "(")
                    || Objects.equals(c, "["))
            {
                s = s.substring(1);
                stack = c + stack;
            }else if(Objects.equals(c, "}")){

                if(stack.isEmpty()) return false;

                if(Objects.equals(stack.substring(0,1), "{")){
                    stack = stack.substring(1);
                    s = s.substring(1);
                }else
                    return false;

            }else if(Objects.equals(c, ")")){

                if(stack.isEmpty()) return false;

                if(Objects.equals(stack.substring(0,1), "(")){
                    stack = stack.substring(1);
                    s = s.substring(1);
                }else
                    return false;

            }else if(Objects.equals(c, "]")){

                if(stack.isEmpty()) return false;

                if(Objects.equals(stack.substring(0,1), "[")){
                    stack = stack.substring(1);
                    s = s.substring(1);
                }else
                    return false;

            }else{
                 return false;
            }
        }

        return stack.isEmpty();
    }

}
