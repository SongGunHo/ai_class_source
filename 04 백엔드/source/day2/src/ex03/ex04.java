package ex03;

public class ex04 { // 메서드 오브 로드
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println("result" + result);
        int result1 = add(10,20, 30);
        System.out.println("result1" + result1);
    }
    static int add(int num1, int num2){
        return num1+ num2;
    }
    static int add(int num1, int num2 , int num3){
        return num1 + num2 + num3;
    }

}
