package Ex02;

public class Ex01 {
    public static void main(String[] args) {
        outer1 outer1 = new outer1(); // 외부 클래스 가 객채가 되어야 내부 클래수 접근 가능
        outer1.inner in = outer1.new inner();
        in.methd();
    }
}
