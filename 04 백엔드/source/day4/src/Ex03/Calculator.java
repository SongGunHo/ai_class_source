package Ex03;

public abstract class Calculator { // 추상 클라스
    int num =100;
    public Calculator(){
        System.out.println("Calculator 생성자");
    }

    public void commonMethod(){
        System.out.println("히위 클레스 공유 하는 기능");
    }
    public abstract int add(int num1 , int num2);
}
