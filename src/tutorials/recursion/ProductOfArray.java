package tutorials.recursion;

public class ProductOfArray {

    public static void main(String[] args) {
        ProductOfArray poa = new ProductOfArray();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(poa.productOfArray(arr,5));
    }

    public int productOfArray(int A[], int N)
    {
        if (N <= 0)
            return 1;
        return (productOfArray(A, N - 1) * A[N - 1]);
    }


}
