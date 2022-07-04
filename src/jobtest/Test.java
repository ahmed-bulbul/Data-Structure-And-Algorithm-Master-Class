package jobtest;


public class Test {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("HELLO");
        sb.reverse();
        System.out.println(sb.toString());

        String x="Bangladesh";
        String rev="";
        char ch;
        for(int i=0;i<x.length();i++){
            ch=x.charAt(i);
            rev=ch+rev;
        }

        System.out.println(rev);

        String s = new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s.equals(s2));

        String s3="ABC";
        String s4="ABC";


    }
}
