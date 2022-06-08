package recursion;

public class ReverseString {

    public static void main(String[] args) {
        char[] str = {'a','b','c','d','e'};
        printReverse(str);

    }

    //normal loop
   /* public static char [] printReverseNormal(char [] str){
        for(int i=str.length-1; i>=0; i--){
            System.out.print(str[i]);
        }
        return str;
    }*/

    public static void printReverse(char [] str ){
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        System.out.println(str[index]);
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
