package study;

public class Java_02_3 {
    public static void main(String[] args) {
        // 자료형 - 문자열(String)
        // 문자로 이루어진 집합
        // char - (' ') , String - (" ")
        System.out.println("== 문자열 ==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

        // 1-1 equals : 값을 비교
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); // true
        String s5 = new String("Hi");
        System.out.println(s3.equals(s5)); // true : 값을 비교
        System.out.println(s3 == s5); // false : 객체를 비교

        // 1-2 indexOf
        String s6 = "Hello! World";
        System.out.println(s6.indexOf("!"));
        // 두번째 느낌표('!')를 찾고 싶으면?
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));

        // 1-3 replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);

        // 1-4 substring
        System.out.println(s7.substring(0, 3));
        System.out.println(s7.substring(0, s7.indexOf("!") + 1));

        // 1-5 toUpperCase
        System.out.println(s7.toUpperCase());

        // 2. 자료형 - StringBuffer

        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        // StringBuffer는 값이 바뀌어도 객체를 새로 생성하지 않는다.
        // 반면 String은 값이 변경될 때마다 객체를 새로 생성한다.
        // String 값이 변경되지 않으면 아래와 같이 '+' 를 사용해도 차이가 없다.
        // 하지만 String 값이 수시로 변경되는 로직이라면 StringBuffer를 고려하는 것이 좋다.
        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak); // true
        a += b;
        System.out.println(a);
        System.out.println(a == bak); // false

        // 3. 자료형 - 배열
        System.out.println("== 베열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
    }
}
