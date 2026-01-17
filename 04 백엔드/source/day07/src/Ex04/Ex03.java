package Ex04;

public class Ex03 {
    public static void main(String[] args) {
        Transportation trans = Transportation.Subway;


        switch (trans){
            case Bus:
                System.out.println("버스");
                break;
            case Subway:
                System.out.println("지하철");
                break;
            case Airplane:
                System.out.println("비행기");
                break;
            case Taxi:
                System.out.println("택시");
                break;

        }
    }
}
