package Ex03;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            void methodA() {
                System.out.println("재정의 된 method 이다");
            }
        };
        a.methodA();
    }
}
