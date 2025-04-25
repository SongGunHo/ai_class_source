package Ex02;

public class Ex01 {
    public static void main(String[] args) {
        try {
            LoginSerivce2 serivce2 = new LoginSerivce2();
            serivce2.process("user01", "1234");
        }finally {
            System.out.println("실행코드 ");
        }

    }
}
