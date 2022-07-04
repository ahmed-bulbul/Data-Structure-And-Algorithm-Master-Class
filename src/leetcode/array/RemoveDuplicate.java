package leetcode.array;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
      // int[] nums  = {0,0,1,1,1,2,2,3,3,4};
        int[] nums  = {0,0,1,1,1,1,3,3,3,3,3};
       // int[] nums  = {-1,0,0,0,0,3,3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {


        if(nums.length <0){
            return 0;
        }
        int j=1;
        for(int i=0;i<nums.length-1;i++ ){

            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }

        return j;

    }
}
