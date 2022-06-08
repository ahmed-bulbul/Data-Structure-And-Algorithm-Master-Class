package recursion;

public class GCD {

        public static void main(String[] args) {
            GCD gcd = new GCD();
            System.out.println(gcd.gcd(12, 18));
            System.out.println(gcd.gcd2(12, 18));
        }

        public int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public int gcd2(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd2(b, a % b);
        }
}
