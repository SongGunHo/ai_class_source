package Ex06;

public interface Seller {
    void sell();


    default void order(){
        System.out.println("seller 쪽에서 주문 하기");
    }

}
