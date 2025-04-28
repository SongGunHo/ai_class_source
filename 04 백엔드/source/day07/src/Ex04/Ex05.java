package Ex04;

public class Ex05 {
    public static void main(String[] args) {
        String trans = "Bus";

        Transportation Bus = Enum.valueOf(Transportation.class, trans);
        System.out.printf("Bus:%s, ordinal():%d%n",Bus, Bus.ordinal());

    }
}
