package tutorials.recursion;

public class Factorial {

    public static void main(String[] args) {

        Factorial fac = new Factorial();
        var rec = fac.factorial(-2);

        System.out.println(rec);

    }

    public int factorial(int n){
        if(n<0) // not work on negative number
            return -1;
        if(n==0 || n==1) // base case
            return 1;
        return n*(factorial(n-1));
    }
}
