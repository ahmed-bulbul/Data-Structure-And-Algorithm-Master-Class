package leetcode.ds14challange;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class IntersactionOf2Array {

    public static void main(String[] args) {
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {


        /*Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<Integer>();

        int p1=0;
        int p2=0;

        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1] < nums2[p2]){
                p1++;
            }else if(nums1[p1] > nums2[p2]){
                p2++;
            }else{
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        int[] result = new int[list.size()];
        int i=0;
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }
        return result;*/

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums1){
            System.out.println("i "+i);
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }

            System.out.println("Map : "+map.get(i));
        }

        System.out.println(map.containsKey(1) +" "+ map.containsValue(""));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: nums2){
            if(map.containsKey(i)){
                if(map.get(i)>1){
                    map.put(i, map.get(i)-1);
                }else{
                    map.remove(i);
                }
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        int i =0;
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }

        return result;


    }


}
