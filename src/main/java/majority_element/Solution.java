package majority_element;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            if(!map.containsKey(num))
                map.put(num, 1);
            else{
                int count = map.get(num);
                count++;
                map.put(num,count);
            }
        }

        int majority = Integer.MIN_VALUE;
        int biggestCount = Integer.MIN_VALUE;
        for (int num : map.keySet())
            if(map.get(num) > biggestCount) {
                majority = num;
                biggestCount = map.get(num);
            }
        return majority;
    }
}
