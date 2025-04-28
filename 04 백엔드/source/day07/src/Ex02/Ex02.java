package Ex02;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "ABC";
//        String s2 = "ABC";
        String s2 = new String("ABC");
        checkEqual(s1 ,s2);

    }
    static void checkEqual(String s1 , String s2){
        System.out.println(s1 == s2); // 주소를 비교하므로 문자열 상수가 아닌 경우 false

        System.out.println(s1.equals(s2)); // 문자열이 생성 되는 출처가 다양하므로 동등성 비교를 해야 한다


    }
}
