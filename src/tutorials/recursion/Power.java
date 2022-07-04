package tutorials.recursion;

public class Power {

    public static void main(String[] args) {
        System.out.println(powerOfTwo(3));
    }

    static int powerOfTwo(int n){
        if(n == 0){
            return 1;
        }
        return 2 * powerOfTwo(n-1);
    }

    static int powerOfTwo2(int n){
        var i=0;
        var power = 1;
        while(i < n){
            power = power * 2;
            i++;
        }
        return power;
    }
}
