package tutorials.recursion;

public class PowerOfInteger {

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

    public static int power(int base, int exp){
        if(exp <0)
            return -1;
        if(exp == 0 || exp==1)
            return base;
        return base*power(base, exp-1);
    }
}
