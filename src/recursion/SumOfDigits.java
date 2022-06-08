package recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(458));
        System.out.println(sumOfDigits2(19));
    }

    public static int sumOfDigits(int n){

        if(n==0 || n<0)
            return 0;
        return n%10 + sumOfDigits(n/10);

    }

    public static int sumOfDigits2(int n){

        if(n<=9){
            return n;
        }
        return n%9;

    }
}
