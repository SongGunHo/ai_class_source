package ex01;

public class Student {
     static int id;
     String name;
     String major;
     final int NUM = 100; // 정적 메모리 , 객체 생성 후에만 접근 가능
    static final int NUM2  = 2000; //
    public static void staicMethod() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void study(){
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
        staticMethod();
    }

    // 정적 메서드 로 개책와
    static void staticMethod(){
//        System.out.println("staticMethod()!);

    }





}

