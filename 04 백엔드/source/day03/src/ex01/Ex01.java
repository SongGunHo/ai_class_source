package ex01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 생성자 함수
        s1.id=100000;
        s1.name= "이름";
        s1.major="정보 통신";
        s1.study();
        System.out.printf("s1주소: %d%n",System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id=2000;
        s2.name ="김이름";
        s2.major="정보통신";
        s2.study();

        System.out.printf("s1 == s2:%s%n" , s1== s2);

        System.out.printf("s2주소: %d%n",System.identityHashCode(s2));

        Student s3 = s2; // s2 가 가지고 있는 주소값을 3에 대입
        s3.id=3000;
        s3.name ="김이름";
        s3.major="정보통신";
        s3.study();
        s2.study();
        System.out.printf("s2 == s3: %s%n" , s2==s3); // true , s2와 s3  주소 값이 같음


        s1= null; // null 값이 없는 상태 더 이상 주소를 가질 수 없다
    }
}
