package tutorials.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci f  = new Fibonacci();
        var res = f.fibonacci(4);
        System.out.println(res);
    }

    public int fibonacci (int n){

        if(n<0)
            return -1;

        if(n==0 || n==1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
