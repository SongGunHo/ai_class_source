package Ex06;

public class Order implements Buyer,Seller {
    @Override
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }
    public void order(){
        //System.out.println("order - 주문 하기");
//        Buyer.super.order();
        Seller.super.order();
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("privateMethod");
    }
    public static void staticMethod(){ // public 범위다
        System.out.println("staticMethod");
    }
}
