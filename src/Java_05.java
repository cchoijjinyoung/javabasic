public class Java_05 {
    public static void main(String[] args) {
        // 1. 반복문 - for
        System.out.println("== for ==");
        // 1-1 기본 사용 방법
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // 아래 코드는 실행하지 않고 다음으로 넘어간다.
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        // 1-2 for each
        System.out.println("== for each ==");
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        // 2. 반복문 - while
        System.out.println("== while ==");
        // 2-1 while
        int a = 0;
        while (a < 5) {
            System.out.println(a++);
            // a++;
        }

        System.out.println();
        a = 0;
        while (a < 5) {
            if (a == 2) {
                a++;
                // continue;
                break;
            }

            System.out.println(a++);
        }

        // 2-2 do-while
        System.out.println("== do-while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);


        // Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
        // *
        // ***
        // *****
        // *******
        System.out.println("== Q1 ==");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
        // 추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        System.out.println("== Q2 ==");
        int waterTemperature = 0;
        while (waterTemperature <= 100) {
            waterTemperature++;
            if (waterTemperature % 10 == 0) {
                System.out.println(waterTemperature);
            }
        }
    }
}
