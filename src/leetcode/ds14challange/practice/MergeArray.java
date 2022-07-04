package leetcode.ds14challange.practice;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m+n;
        int[] newArray = new int[totalLength];
        int index = 0;

        for(int i=0;i<m;i++){
            newArray[index] = nums1[i];
            index++;
        }

        for(int j=0;j<n;j++){
            newArray[index]=nums2[j];
            index++;
        }
        for(int k=0;k<newArray.length-1;k++){
            if(newArray[k]>newArray[k+1]){
                int temp=newArray[k];
                newArray[k]=newArray[k+1];
                newArray[k+1]=temp;
            }
        }

        System.out.println(Arrays.toString(newArray));

    }
}
