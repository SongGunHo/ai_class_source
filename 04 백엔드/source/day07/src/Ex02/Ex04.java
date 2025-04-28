package Ex02;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(500); // 기본 버퍼 사이즈는 500byte
        System.out.printf("sb 주소 =%d%n" , System.identityHashCode(sb));
        sb.append("ABC");
        System.out.printf("sb 주소 =%d%n" , System.identityHashCode(sb));
        sb.append("DEF");

        System.out.printf("sb 주소 =%d%n" , System.identityHashCode(sb));
        sb.append("GEF");


        String str = sb.toString();
        System.out.println(str);
        System.out.printf("str 주소 :%d%n" , System.identityHashCode(str));
        System.out.println(str == "ABCDEFGHI");


    }
}
