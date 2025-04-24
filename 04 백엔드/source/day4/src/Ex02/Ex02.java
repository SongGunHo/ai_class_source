package Ex02;

public class Ex02 {
    public static void main(String[] args) {
        Aniaml [] aniaml = {
                new Human(),
                new Tiger(),
                new Bird()
        };
        for (Aniaml aniaml1 : aniaml){
            aniaml1.move();
            if (aniaml1 instanceof Human){
                Human human = (Human) aniaml1; // 강제 형변환 다운 캐스팅
                human.reading();
            }else if(aniaml1 instanceof Tiger){
                Tiger tiger =(Tiger) aniaml1;
                tiger.hunting();
            }else if (aniaml1 instanceof Bird bird){ // jdk 17 qj
                bird.sing();
            }

        }

    }
}
