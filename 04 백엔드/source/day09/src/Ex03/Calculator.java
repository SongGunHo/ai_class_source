package Ex03;
@FunctionalInterface
public interface Calculator {
    int add(int num1 , int num2);
    //int minus(int num1, int num2); 한개만 적용이 가능 하다 왜냐하면 람다식은 한가지 변수만 가능 하기 떄문에
}
