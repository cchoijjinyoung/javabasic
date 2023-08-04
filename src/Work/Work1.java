package Work;

import java.util.Scanner;

public class Work1 {

    public static void displayMenu() {
        String[] menuList = {
                "<<<<[메뉴선택]>>>>"
                , "1. 회원 관리"
                , "2. 과목 관리"
                , "3. 수강 관리"
                , "4. 결제 관리"
                , "5. 종료"
        };

        for (String menu : menuList) {
            System.out.println(menu);
        }
    }

    public static void selectMenu(int inputMenu) {
        switch (inputMenu) {
            case 1:
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                break;

            case 2:
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                break;

            case 3:
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                break;

            case 4:
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                break;

            case 5:
                System.out.println("프로그램을 종료합니다.");
                break;

            default:
                System.out.println("입력 값이 정확하지 않습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitYn = false;
        int inputMenu = 0;

        do {
            displayMenu();

            inputMenu = scanner.nextInt();

            selectMenu(inputMenu);

        }  while (inputMenu != 5);
    }
}
