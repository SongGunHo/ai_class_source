package Ex03;

public class Order implements Seller ,Buyer {
    @Override
    public void Buyer() {

    }

    @Override
    public void Seller() {
        System.out.println("ㅑ");
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }


    int num =100;
}
