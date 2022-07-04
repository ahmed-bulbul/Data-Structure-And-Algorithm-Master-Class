package tutorials.recursion;

public class GCD {

        public static void main(String[] args) {
            GCD gcd = new GCD();
            System.out.println(gcd.gcd(18, 12));
        }

        public int gcd(int a, int b) {
            if(a<0 || b<0){
                return -1;
            }

            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

}
