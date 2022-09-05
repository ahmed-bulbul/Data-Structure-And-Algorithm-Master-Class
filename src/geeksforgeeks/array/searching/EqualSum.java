package geeksforgeeks.array.searching;

//https://practice.geeksforgeeks.org/problems/equal-sum0810/1
//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/?ref=lbp

//https://practice.geeksforgeeks.org/explore?page=5&category[]=Arrays&sortBy=submissions
public class EqualSum {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3 };
        int arr_size = arr.length;
        System.out.println(equilibrium(arr, arr_size));
    }

    private static boolean equilibrium(int[] arr, int n) {

        int leftSum;
        int rightSum;

        for(int i=0;i<n;i++){

            //check


            leftSum=0;
            for(int j=0;j<i;j++)
                leftSum+=arr[j];

            rightSum=0;
            for(int j=i+1;j<n;j++)
                rightSum+=arr[j];

            if(leftSum==rightSum)
                return true;


        }

        return false;
    }
}
