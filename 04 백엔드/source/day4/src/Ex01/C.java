package Ex01;

public class C extends B{
    int numC = 30;
    public C(){
        super();// B 상위 기본 클래스 참조
        System.out.println("C 생성자");
    }
}
