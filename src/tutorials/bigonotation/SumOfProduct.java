package tutorials.bigonotation;

import java.util.Arrays;

public class SumOfProduct {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,2};
        SumOfProduct sop = new SumOfProduct();
       // sop.sumOfArray(arr);
      //  sop.printPairs2(arr);
        sop.reverseNumber(arr);

    }

    void sumOfArray(int[] array){

        int sum = 0; //---------------------> O(1)
        int product=1; //-------------------> O(1)

        for (int j : array) { //-------------> O(N)
            sum += j; //-----------------------> O(1)
        }

        for(int i=0;i<array.length;i++){ //---------------> O(N)
            product *= array[i]; // ---------------------> O(1)
        }

        System.out.println(sum +" "+product); //-----------> O(1)

        // Drop constants and lower order terms. E.g. O(3*n^2 + 10n + 10) becomes O(n^2).
        // Eliminate Numerical part
        // O(N) + O(N) = 2 O(N) = O(N)

        // finally, time complexity of this program is = O(N)

    }

    void printPairs(int[] array){
        for(int i=0;i<array.length;i++){ //----------------->O(N)
            for(int j=0;j<array.length;j++){ //------------> O(N)
                System.out.println(array[i]+""+array[j]); //----------->O(1)
            }
        }
    }

    // Total Complexity = O(N) * O(N) = O(N*N)
    // finally, time complexity of this program is = O(N*N)

    void printPairs2(int[] array){
        for(int i=0;i<array.length;i++){ //----------------->O(N-1)
            for(int j=i+1;j<array.length;j++){ //------------> O(N-2)
                System.out.println(array[i]+""+array[j]); //----------->O(1)
            }
        }
    }

/*   1. counting iteration
     1st -------------> n-1
     2nd ------------> n-2
     (n-1)+(n-2)+(n-1)+.....2+1
     = 1+2+.....+(n-3)+(n-2)+(n-1)
     =n(n-1)/2
     = n*n/2 - n/2
     = n*n

     */

    // 2. Average Work

    /*
        OUTER LOOP -->  n time
        Inner Loop ?
        let 1st loop ---------------------->10
        so, 2nd loo will be ---------------> 9

        so average = 10/2 = 5
        So n = n/2

        total = n*n/2 = n^2/2 = O(n^2)
    *
    * */

    void printUnorderedPairs(int[] arrayA, int[] arrayB){
        for(int i=0;i<arrayA.length;i++){ //----------O(a)
            for(int j=0;j<arrayB.length;j++){ //-------O(b)
                if(arrayA[i] < arrayB[i]){
                    System.out.println(arrayA[i] + ","+ arrayB[j]); //---------O(1)
                }
            }
        }
    }

    //total time complexity = O(ab)


    void reverseNumber(int[] array){
        System.out.println(array.length/2);
        for(int i=0;i<array.length/2;i++){ //------------> O(n/2)
            int other = array.length-i-1; // ------->O(1)
            int temp = array[i];  // ------->O(1)
            array[i] = array[other];  // ------->O(1)
            array[other]=temp;  // ------->O(1)
        }
        System.out.print(Arrays.toString(array));  // ------->O(1)
    }

    //so time complexity is = O(n)



}
