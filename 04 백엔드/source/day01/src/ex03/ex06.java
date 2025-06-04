package ex03;

public class ex06 {
    public static void main(String[] args) {
        /*
        * 정수를 int으로 인식 100000 -> int 범위르 넘어가는 숫자 -> 오류

         */
//        long num = 10000000000; // 정수면 무조건 int 부터 자료형을 결정  -> int 가 아니면 long 으로 변환

//        double num2 =10.1234;
//        float num2 =10.1234; // 실수면 무조건 double 로 자료형 결정 -> double 아니면 변경 false
       float nun2 =10.1234F;
        long num3 = 100_00000_00L; // 가독성을 높이기 위해서 _를 사용 할수 있다
        long num1 = 1000000000L; // 처음부터 long 자료형으로 인식 8바이트의 공간 할당
        byte num4 =100; // int 로 자료형 ->byte 변환
    }
}
