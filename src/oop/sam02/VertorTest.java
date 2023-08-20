package oop.sam02;

import java.util.Vector;

public class VertorTest {

    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("홍길동");
        vector.add("남자");
        vector.add(25);
        vector.add(80.15);


        // 형변환이 불편 -> 제네릭이 나옴
        String name = (String)vector.get(0);
        int age = (int)vector.get(2);

        for (Object x : vector) {
            System.out.println(x);
        }

    }
}
