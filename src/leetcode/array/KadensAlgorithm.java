package leetcode.array;



public class KadensAlgorithm {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       // int[] nums = {-2,-1};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

        int maxSum=0;
        int currSum=0;

        for(int i=0;i< nums.length;i++){
            currSum=currSum+nums[i];

            if(currSum>maxSum){
                maxSum=currSum;
            }

            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}
