package Ex04;

public class Ex07 {
    public static void main(String[] args) {
        Transportation trans = Transportation.Bus;
        int baseFare = trans.getBaseFare();
        System.out.println(baseFare);

        int total = trans.getTotal(10);
        System.out.println(total);



    }
}
