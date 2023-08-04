package study;
class Outer {
    public void print() {
        System.out.println("Outer.print()");
    }

    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    static class InnerStaticClass {
        void innerPrint() {
            // Outer 클래스가 static이 아니기 때문에 불가
             // Outer.this.print(); -
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Java_12 {
    // 내부 클래스 (인스턴스, 정적, 지역, 익명 클래스)
    // 내부 클래스에서 외부 클래스 멤버에 접근 가능
    // 외부에서는 내부 클래스에 접근 불가

    // 외부 클래스
    Outer o1 = new Outer();

    // 내부 클래스 - 인스턴스
    Outer.Inner il = new Outer().new Inner();

    // 내부 클래스 - 정적
    // static이기 때문에 객체생성은 하지 않아도 된다. - new Quter와 같이 클래스로 접근
    Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();

    // 익명 클래스
    Person p1 = new Person() {
        @Override
        public void printInfo() {
            System.out.println("Main.printInfo");
        }
    };
}
