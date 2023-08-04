//package study;
//// Java 프로그래밍 - 상속
//// 하나의 자식클래스가 여러개의 부모클래스를 상속받는 것은 불가능하다.
//// private, default(같은패키지에서만 접근가능)멤버는 자식클래스에서 접근이 불가하다.
//
///**
// * super - 부모클래스와 자식클래스의 멤버 이름이 같을 때 구분하는 키워드.
// * super() - 부모 클래스의 생성자 호출.
// */
//
//// Person.class - 다른 클래스에서 중복되어서 주석 처리함.
////class Person {
////    String name;
////    int age;
////    public int a1;
////    private int a2;
////
////    Person() {}
////    Person(String name, int age) {
////        this.name = name;
////        this.age = age;
////    }
////
////    public void printInfo() {
////        System.out.println("Person.printInfo");
////        System.out.println("name: " + name);
////        System.out.println("age: " + age);
////    }
////}
//
//// Student 클래스 - Person 상속, 접근제어자 확인
//class Student extends Person {}
//
//// Student 클래스 - Person 상속, super 사용, 오버라이딩
//
//
//
//public class Java_08 {
//
//    public static void main(String[] args) {
//
////      Test code
////      1. 상속
//        System.out.println("=============");
////        Student s1 = new Student();
////        s1.name = "a";
////        s1.age = 25;
////        s1.printInfo();
//
//
////      2. super, super(), 오버라이딩
//        System.out.println("=============");
////        Student2 s2 = new Student2("b",32, 1);
////        s2.printInfo();
//
//    }
//}
//
