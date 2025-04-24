package Ex01;

public class B extends A{
    int numB =20;
    public B(){
        super(); // A 클래스 상위 기본 생성자 참조
        System.out.println("B 생성자");
    }
}
