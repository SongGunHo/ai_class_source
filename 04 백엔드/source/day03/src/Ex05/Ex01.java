package Ex05;

public class Ex01 {
    public static void main(String[] args) {
//        joinService s1 = new joinService();
//        joinService s2 = new joinService();
        joinService s1 = joinService.getInstance();
        joinService s2 = joinService.getInstance();

        System.out.println(s1 == s2);
    }
}
