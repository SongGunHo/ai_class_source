package ex01;

public class ex05_2 {
    public static void main(String[] args) {

        for (int i=1; i<=40; i++){
            int num = i % 10;
            System.out.printf("학생%d,  방번호%d%n ", i, num);
        }
    }
}
