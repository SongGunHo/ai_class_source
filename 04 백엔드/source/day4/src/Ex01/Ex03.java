package Ex01;

public class Ex03 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();// 상위 클래스 에서 변환 하면 가능 한데 하위 클래스 에서 자동 형변환이 안된다

        if(ad instanceof C){
            C c1 = (C) ad; // 상위 클래스 자료형 -> 하위 클래스 자료형으로 강제 형변환

        }

        C c1 = (C)ad; // 상위 클래스 자료형 -> 하위 클래스 자료형으로 강제 형변환
        if (ac instanceof C c2){ // JDK  17 버전 에서 추가된 문법
            System.out.println(c2.numC);
        }

    }
}
