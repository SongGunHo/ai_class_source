package ex01;

public class ex01 {
    public static void main(String[] args) {
        int num = 10;
        boolean result = num ++ > 10 && (num = num+ 10)> 20;
        System.out.println(result);
        System.out.println(num);
    }
}
