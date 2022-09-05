package geeksforgeeks.array.searching;

import java.util.HashMap;

public class FindMajority {

    public static void main(String[] args)
    {

        int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }

    private static void findMajority(int[] arr, int n) {

        int count =1;

        /*for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > ( n/2 ) ){
                System.out.println(arr[i]);
            }
            count=1;

        }*/

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){
            if(map.containsKey(i)){
                map.put(arr[i],1);
                count++;
            }
            map.put(arr[i],1);

            if(count > ( n/2 ) ){
                System.out.println(arr[i]);
            }
            count=1;
        }



    }
}
