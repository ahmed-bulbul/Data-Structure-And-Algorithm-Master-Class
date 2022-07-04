package leetcode.array;

import java.util.Arrays;

public class ConcatationOfArray {

    public static void main(String[] args) {

        int[] nums  = {1,2,1};
        System.out.println(Arrays.toString(concats(nums)));

    }

    public static int[]  concats(int[] nums){
        int len=nums.length*2;
        int[] newArray = new int[len];
        int j=0;
        for(int i=0;i<newArray.length;i++){

            if(i>=nums.length){
                newArray[i]=nums[j];
                j++;
            }else{
                newArray[i]=nums[i];
            }
        }
        return newArray;
    }
}
