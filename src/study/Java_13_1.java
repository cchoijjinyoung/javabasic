package study;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java_13_1 {
    public static void main(String[] args) throws IOException {
        // 콘솔 입출력
        // 1. 입력
        // 1-1. 다른 입력 방식 참고
        // referInputStream();

//         1-2. Scanner
//         next()
//        System.out.println("== Scanner ==");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("입력1: ");
//        System.out.println(sc.next());
//        sc.nextLine();
//        // nextInt()
//        System.out.println("입력2: ");
//        System.out.println(sc.nextInt());
//        sc.nextLine();
//        // nextLine()
//        System.out.println("입력3: ");
//        System.out.println(sc.nextLine());

        // 참고) 정수, 문자열 반환
        int num = Integer.parseInt("12345");
        String str = Integer.toString(12345);


        // 2. 출력
        System.out.println("== 출력 ==");
        // 엔터키 자동으로 출력
        System.out.println("Hello");
        System.out.println("World");

        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);

        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10);
        System.out.printf("%x\n", 10);

        System.out.printf("%f\n", 5.2f);

        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "안녕하세요");

        // 앞에 숫자를 준 만큼 공간을 확보
        // 마이너스를 붙이면 왼쪽으로 붙여서 출력
        System.out.printf("%-5d\n", 123);  // 123
        System.out.printf("%5d\n", 1234);  //  1234
        System.out.printf("%5d\n", 12345); // 12345

        System.out.printf("%.2f\n", 1.1234567f); // 1.12 - (.2f : 소수점 둘째자리로 반올림)
    }

    private static void referInputStream() throws IOException {
//        // System.in
//        System.out.println("== System.in ==");
//        System.out.print("입력 :");
//        int a = System.in.read() - '0';
//        // System.in.read() - 캐릭터 값 하나를 입력 받아옴.
//        // 숫자 값을 받아오면 문자이기 때문에 아스키코드값에 매핑이 되어있음.
//        // ==> ( - '0') 부분은 아스키 코드 값을 빼서 숫자로 변환하는 과정.
//        System.out.println("a = " + a);
//        System.in.read(new byte[System.in.available()]); // 버퍼를 남아있는 것을 제거
//
//        // InputStreamReader
//        System.out.println("== InputStreamReader ==");
//        InputStreamReader reader = new InputStreamReader(System.in);
//        char[] c = new char[3];
//        System.out.println("입력:");
//        reader.read(c);
//        System.out.println(c);


        // BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력: ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }
}
