package container_with_most_water;

class Solution {

    public static void main(String[] args) {

        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int i = 0; int j = height.length - 1;

        int maxArea = 0;

        while (i < j) {

            int temp = Math.min(height[i], height[j]);

            if(maxArea < temp * Math.abs(i - j))
                maxArea = temp * Math.abs(i - j);

            if(height[i] < height[j])
                i++;
            else
                j--;
        }

        return maxArea;
    }
}