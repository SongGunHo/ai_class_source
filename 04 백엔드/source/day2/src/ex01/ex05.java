package ex01;

public class ex05 {
    public static void main(String[] args) {
        int result = 5;
        switch (result){
            case 1:
                 System.out.println("약국");
                 break;

            case 2:
                System.out.println("정형 외과");
                break;

            case 3:
                System.out.println("피부과");
                break;

            case 4 :
                System.out.println("치과");
                break;

            case 5:
                System.out.println("헬스클럽");
                break;
            default:
                System.out.println("없음");
        }
    }
}
