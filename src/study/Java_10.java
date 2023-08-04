package study;

abstract class Person_3 {
    abstract void printInfo();
}

class Student_3 extends Person_3 {
    public void printInfo() {
        System.out.println("Student_3.printInfo");
    }
}

public class Java_10 {
    public static void main(String[] args) {
        // 추상클래스 (Abstact Class)
        // 하나 이상의 추상메소드를 포함하는 클래스
        // 반드시 구현해야 하는 부분에 대해 명시적으로 표현
        // 추상 클래스 자체는 객체 생성이 불가능하다.
        Student_3 s1 = new Student_3();
        s1.printInfo();

        Person_3 p2 = new Person_3() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo();
    }
}
