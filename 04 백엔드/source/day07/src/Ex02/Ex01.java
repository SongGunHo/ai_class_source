package Ex02;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        String str = "ABC";
        String str1 = "ABC";

        System.out.printf("str == str2:%s , str.equals(str2)", str == str1 , str.equals(str1));
        System.out.printf("str의 주소 %d%n", System.identityHashCode(str));
        System.out.printf("str1의 주소 %d%n", System.identityHashCode(str1));










    }
}
