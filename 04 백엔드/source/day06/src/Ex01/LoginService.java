package Ex01;

public class LoginService {
    public void process(String userId, String userPw)throws UserIdException, UserPwException{
        /**
         * userId  -"user01"
         * userPw - "1234"
         */

            if (!userId.equals("user01")) {
                throw new UserIdException("아이디가 일치 하지 않습니다");
            }

            if (!userPw.equals("1234")) {
                throw new UserPwException("비밀번호가 일치 하지 않습니다");
            }
            System.out.println("로그인 처리 완료");
    }
}
