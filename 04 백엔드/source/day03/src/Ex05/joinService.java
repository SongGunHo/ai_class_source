package Ex05;

public class joinService {
    private static joinService instance;
    private joinService(){

    }
    // 회원 가입 처리 기능
    public void process(){
        System.out.println("회원 가입 처리 완료");
    }
    public static joinService getInstance(){
        if(instance == null){
            new joinService();
        }
        return instance;
    }
}
