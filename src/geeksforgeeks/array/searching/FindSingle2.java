package geeksforgeeks.array.searching;

import java.util.Arrays;

public class FindSingle2 {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
        int size = 7;
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(singleelement(arr, size));
    }

    static int singleelement(int arr[], int n)
    {
        int low = 0, high = n - 2;
        int mid;

        while (low <= high)
        {
            mid = (low + high) / 2;
            if (arr[mid] == arr[mid ^ 1])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return arr[low];
    }
}
