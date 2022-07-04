package tutorials.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        DecimalToBinary dtb = new DecimalToBinary();
        System.out.println(dtb.decimalToBinary(10));
    }

    private int decimalToBinary(int i) {
        if (i == 0) {
            return 0;
        }
        return i%2 + 10 * decimalToBinary(i/2);
    }
}
