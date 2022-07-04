package leetcode.ds14challange;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {2,14,18,22,22};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        if(nums==null || nums.length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums) {
            if (!set.add(i)) { // Hash Set only add unique value; that's why if not
                return true;
            }
        }
        return false;
    }
}
