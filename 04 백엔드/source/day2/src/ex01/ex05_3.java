package ex01;

public class ex05_3 {
    public static void main(String[] args) {
        byte num1 = 10;
        double num2 = 3.0;

        int result = num1 * (int)num2; // 오답
        double result2 = (int)(num1* num2);
        System.out.printf("result= %d, result2= %d%n", result, result2);
    }
}
