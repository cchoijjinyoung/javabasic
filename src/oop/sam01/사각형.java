package oop.sam01;

public class 사각형 extends 도형 {
    int 길이;
    int 높이;

    public 사각형(int x좌표값, int y좌표값, int 길이, int 높이) {
        super(x좌표값, y좌표값);
        this.길이 = 길이;
        this.높이 = 높이;
    }

    @Override
    public void 그리기() {
        System.out.println("좌표값 : (" + x좌표값 + ", " + y좌표값 + ")");
        System.out.println("좌표값 기준으로 x축으로 " + 길이 + "만큼 이동");
        System.out.println("좌표값 기준으로 y축으로 " + 높이 + "만큼 이동");

    }

    @Override
    public void 지우기() {
        // 무조건 오버라이드를 해줘야하는구나
    }
}
