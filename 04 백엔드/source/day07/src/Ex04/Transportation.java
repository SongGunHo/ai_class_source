package Ex04;

public enum Transportation { //추상 클래스
    Bus(1400) {
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    }, Subway(1450){
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    } , Taxi(4500){
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    } , Airplane(40000){
        @Override
        public int getTotal(int person) {
            return getBaseFare() * person;
        }
    };// enum 클래스
    private final int baseFare;
    Transportation(int baseFare){
        this.baseFare= baseFare;
    }
    public int getBaseFare(){
        return baseFare;
    }
    public abstract int getTotal(int person); // 추상 메서드 사용 가능











}
