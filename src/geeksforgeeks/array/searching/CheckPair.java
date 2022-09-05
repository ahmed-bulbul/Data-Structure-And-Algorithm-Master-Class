package geeksforgeeks.array.searching;

public class CheckPair {

    public static void main(String[] args) {

        int A[] = {0, -1, 2, -3, 1};
        int x = -2;
        int size = A.length;

        if (chkPair(A, size, x)) {
            System.out.println("Valid pair exists");
        } else {
            System.out.println("No valid pair exists for " + x);

        }
    }

    static boolean chkPair(int A[], int size, int x) {
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(A[i]+A[j]==x){
                    System.out.println(A[i]+" "+A[j]);
                    return true;
                }

            }
        }
        return false;
    }


}