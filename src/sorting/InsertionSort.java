package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr ={5,4,2,3,1};
        int i,j,item;

        for(i=1;i< arr.length;i++){
            item = arr[i];
            j=i-1;

            while(j>=0 && arr[j] > item){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
        System.out.println(Arrays.toString(arr));
    }
}
