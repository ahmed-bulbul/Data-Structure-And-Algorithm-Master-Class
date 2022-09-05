package geeksforgeeks.array.rotation;

import java.util.HashSet;

public class FindOnlyRepetitiveEm {

    public static void main(String[] args) {

        int[] input = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
        System.out.println(findRepeating(input));
    }

    public static int findRepeating(int[] input) {
        int n = input.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int j : input) {
         /*   if (!set.add(j))
                return j;*/
            if (set.contains(j))
                return j;
            set.add(j);

        }
        return -1;

    }




}
