package Ex02;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(500);
        /*
        StringBuffer sb1 = sb.append("ABC");
        StringBuffer sb2 = sb1.append("DEF");
        */
        sb.append("ABC")
                .append("DEF")
                .append("GHI")
                .toString(); // 메서드 체인
    }
}
