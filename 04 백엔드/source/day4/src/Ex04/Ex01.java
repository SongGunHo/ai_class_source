package Ex04;

public class Ex01 {
    public static void main(String[] args) {
        simpleCalculator cls = new simpleCalculator();
        int result = cls.add(10,20);
        System.out.println(Calculator.num);// 정적 상수
        System.out.println(cls.num);
        System.out.println(result);
    }

}
