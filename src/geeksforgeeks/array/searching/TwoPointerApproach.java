package geeksforgeeks.array.searching;

public class TwoPointerApproach {

    public static void main(String[] args) {
        // array declaration
        int arr[] = { 2, 3, 5, 8, 9, 10, 11 };

        // value to search
        int val = 17;

        // size of the array
        int arrSize = arr.length;

        // Function call
        System.out.println(isPairSum(arr, arrSize, val));
    }

    private static boolean isPairSum(int[] arr, int arrSize, int val) {

        int i=0;
        int j=arrSize-1;

        while (i<arrSize){
            if(arr[i]+arr[j] == val){
                return true;
            }else if(arr[i]+arr[j] < val){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
