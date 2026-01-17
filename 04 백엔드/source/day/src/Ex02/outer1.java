package Ex02;

public class outer1 {
    // 인스턴스 내부 클래스
    private int num1 =300;
    private int num2 =100;
    class inner{
//        private static int num = 100;// jdk 16 버전  부터 가능
        private int num1 =100;


        public void methd(){
            System.out.println("인스턴스 내부 클래스");
            System.out.printf("inner.num1:%d%n", num1);
            System.out.printf("outer1.num2:%d%n", num2);
            System.out.printf("outer1.num1:%d%n", outer1.this.num1);


        }
    }
}
