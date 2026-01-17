package Ex03;

public class Outer4 {
    private Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };
    Calculator method(int num3){ // 참조가 끊기지 않게 하는 방법은 외부 에서 Calculator 반환값으로 지정 하면 된다
        Calculator cal = new Calculator(){
            @Override
            public int add(int num1, int num2) {
                /**
                 * num3 이 제거 되면 안되므로 걔속유지가 되어야 한다
                 * 지역 변수가 상수뢰 되면서 코드 영역 메모리 ( 정적 메모리) 에 활당
                 * 컴파일러가 final 예약어를 자동 추가ㅣ
                 */

                return num1 + num2 + num3;
            }
        };
        return cal;
    }
}
