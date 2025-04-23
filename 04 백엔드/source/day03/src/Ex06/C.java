package Ex06;

public class C extends B{
    int numC = 30;
    public C (){
        super(); // 첫번재 라인이 생성이 된다 자동 추가 그리고 B 클레스 호출이 된다
        System.out.println("C 생성자");
    }// 생성자 함수
}
