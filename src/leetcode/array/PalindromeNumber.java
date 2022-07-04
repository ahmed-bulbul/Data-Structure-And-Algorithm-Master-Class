package leetcode.array;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum  =((sum*10)+rem);
            temp = temp/10;
        }
        if(sum==x)
            return true;
        return false;
    }
}
