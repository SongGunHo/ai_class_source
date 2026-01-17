package ex01;

public class ex04 {
    public static void main(String[] args) {
        for (int i=2;  i<=9; i++){
//            System.out.println("-------" + i + "단 ---------");
            System.out.printf("---- %d단 -------\n", i);
            for(int j=2; j<=9; j++){
//                System.out.println(i +"x" + j + "="  + i*  j);
                System.out.printf("%d, x x % d = %d\n" , i, j, i*j);
            }
        }
    }
}
