package ex01;

public class ex05_1 {
    public static void main(String[] args) {
        int num =9;
        for (int i=2; i<= 9; i++){
            if(i % 2 == 0){
                continue;
            }

            for (int j=2; j<=9; j++)


                System.out.printf("%d x %d = %d%n", i , j, i* j );

    }}
}
