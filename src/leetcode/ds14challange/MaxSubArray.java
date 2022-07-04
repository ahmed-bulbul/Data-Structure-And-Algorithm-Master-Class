package leetcode.ds14challange;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        // int[] nums = {-2,-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int sum = nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=nums[i];
            }else{
                sum=sum+nums[i];
            }

            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
