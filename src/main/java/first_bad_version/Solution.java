package first_bad_version;

public class Solution {

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right){
            int mid = left + (right - left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int version){
        return true;
    }

}