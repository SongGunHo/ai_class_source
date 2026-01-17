package Ex06;

public interface Buyer {
    void buy();


    default void order(){ // 접근 제언자 public ,  인터페이스 기본 명령어 일부러 작성 한거 알려 주는것
        System.out.println("Buyer - 주문하기");
    }
}
