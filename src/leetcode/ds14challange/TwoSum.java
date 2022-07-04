package leetcode.ds14challange;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("["+result[0] + "," + result[1]+"]");
    }


    public static  int[] twoSum(int[] nums, int target) {


        int[] expRes = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int matchingVal = target-nums[i];
                if(nums[j]==matchingVal){
                    expRes[0]=i;
                    expRes[1]=j;
                }
            }
        }

        return expRes;

    }

}
