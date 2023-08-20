package oop.exception;

public class ExceptionTest {
    /**
     * 예외를 처리하는 2가지 방법
     * 1. 직접 내가 처리.
     * 2. 내가 처리하지 않고, 호출하는 곳으로 넘긴다.
     */
    public static void main(String[] args) {
        try {
            method(1, 0);
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void method(int i, int j) throws Exception {
        if (j == 0) {
            throw new Exception("0으로 나눌 수 없습니다");
        }

        int k = i / j;
        System.out.println(k);
    }
}
