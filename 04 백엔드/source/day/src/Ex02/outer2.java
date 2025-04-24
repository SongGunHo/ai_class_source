package Ex02;

public class outer2 {
    static class inner{
        private int num = 100;
        private int num1 = 200;
        public void instanceMethod(){
            /**
             *
             * 정적 내부 클래스
             */
        }
        public void method(){
            System.out.println("정적 내부 클래스");

            // 외부 클래스의 인스턴스 자원 접근 불가
            // 정적 자원은 접근 가능
            System.out.println(num1);

        }
    }
}
