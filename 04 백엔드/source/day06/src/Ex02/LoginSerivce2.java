package Ex02;

public class LoginSerivce2 {
    public void process(String userId, String userPw){
        if(!userId.equals("user01")){
            throw new UserIdException2("아이디가 일치 하지 않습니다");
        }
        if(!userPw.equals("1234")){
            throw new UserPw2Exception("비밀 번호가 맞지 않습니다");
        }
        System.out.println("로그인 성공");
    }
}
