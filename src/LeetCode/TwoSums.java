package LeetCode;

import java.util.Arrays;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int i;
        int j = 0;
        int sum = 0;
        for(i=0 ; i < l ; i++) {
            int k = i+1;
            for (j = k ; j< l ; j++) {
                int charI = nums[i];
                int charJ = nums[j];
                sum = charI + charJ;
                if (sum == target)
                    break;
            }
            if (sum == target)
                break;
        }
        int[] twoNumbers = new int[2];
        twoNumbers[0] = i;
        twoNumbers[1] = j;
        return twoNumbers;
    }

    public static void main(String[] args) {
       int[]  nums = new int[4];
       nums[0] = 11;
       nums[1] = 15;
       nums[2] = 2;
       nums[3] = 7;
        int[] numbers =  TwoSums.twoSum(nums,9);
        System.out.println(Arrays.toString(numbers));
    }
}
