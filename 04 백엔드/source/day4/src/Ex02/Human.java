package Ex02;

public final class Human extends Aniaml  {
    @Override
    public void move(){// 매서드 재 정의
        super.move();
        System.out.println("두발로 직립 보행 한다 ");
    }
    public final void reading(){// 재정의가 불가능 하다
        System.out.println("독서를 한다");
    }



}
