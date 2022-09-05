package geeksforgeeks.array.searching;

import java.util.HashMap;
import java.util.HashSet;

public class FindSingle {

    // Return the maximum Sum of difference
    // between consecutive elements.
    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
   /*     int res = ar[0];

        for (int i = 1; i < ar_size; i++){
            res = res ^ ar[i];
            System.out.println("res "+res);
        }
        return res;*/

        HashMap<Integer, Integer> m = new HashMap<>();
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i <ar_size; i++)
        {
            if (!m.containsKey(ar[i]))
            {
                sum1 += ar[i];
                m.put(ar[i], 1);
            }
            sum2 += ar[i];
        }

        // applying the formula.
        return (int)(2 * (sum1) - sum2);


    }

    // Driver code
    public static void main (String[] args)
    {
        int ar[] = {3, 5, 4, 5, 3, 2,4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");
    }
}
