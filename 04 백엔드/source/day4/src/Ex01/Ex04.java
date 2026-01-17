package Ex01;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        A a = c;
        System.out.printf("a == c: %s%n", a==c);
        System.out.printf("a == b: %s%n", a==b);
        System.out.printf("b == c: %s%n", b==c);

        System.out.printf("a instanceof c: %s%n", a==c);
        System.out.printf("a instanceof b: %s%n", a==b);
        System.out.printf("a instanceof c: %s%n", b==c);
    }
}
