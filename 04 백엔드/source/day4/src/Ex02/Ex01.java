package Ex02;

public class Ex01 {
    public static void main(String[] args) {
        Aniaml human = new Human(); // Human Animal
        human.move();

        Aniaml tiger = new Tiger(); // Tiger -> Animal
        tiger.move();

        Aniaml bird = new Bird(); // Bird -> Animal
        bird.move();


        Aniaml [] aniamls = new Aniaml[3];
        aniamls[0]= human; // aniaml aniamls[0] =  new Human();
        aniamls[1] = tiger;
        aniamls[2] = bird;


        for(Aniaml aniaml : aniamls){
            aniaml.move();
        }



    }
}
