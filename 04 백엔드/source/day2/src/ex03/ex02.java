package ex03;

public class ex02 {
    public static void main(String[] args) { // 메인 함수 시
        int num1 = 10;
        int num2 = 20;
        int result2 = add(num1,num2);
//        System.out.println(result2);
    }
    static int add(int num1, int num2){// static 동적으로 하며 코드를 쌓인다
       int result = num1 +num2;
       return result;
    }
}
