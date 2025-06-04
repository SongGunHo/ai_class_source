package ex03;

public class ex10 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 10.123;
        /**
         * 연산은 같은 자료형 끼리만 가능
         * 연산을 하기 위해서 다른 자료형을 변경 해서 같은 자료형 으로 맞춘다
         *(자동)
         *1) int ->double
         * 2)double ->int
         *
         * 자료형을 결정 하는 기준 자동 형변환 기준
         * (작은 형변환 -> 큰자료형 )
         * (정수 -> 실수)
         * 1) 으로선택된
         *  int num1 -double num2
         */
        double result = num1 + num2;
        System.out.println(result);
    }
}
