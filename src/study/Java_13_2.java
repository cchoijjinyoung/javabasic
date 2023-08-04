package study;

import java.io.*;

public class Java_13_2 {

    public static void main(String[] args) throws IOException {
        // 파일 입출력
        // 1. 파일 쓰기
        // FileWriter
        FileWriter fw = new FileWriter("./memo.txt"); // 경로에 파일 작성
        String memo = "헤드 라인\n";
        fw.write(memo);

        memo = "1월 1일 날씨 맑음\n";
        fw.write(memo);

        fw.close();

        // PrintWriter
        PrintWriter pw = new PrintWriter("./memo.txt");
        memo = "헤드 라인";
        pw.println(memo);

        memo = "1월 1일 날씨 맑음";
        pw.println(memo);

        pw.close();

        // 파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt", true);

        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);
        fw2.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true));
        memo = "1월 3일 날씨 또 맑음!";
        pw2.println(memo);
        pw2.close();

        // 2. 파일 입력 - 데이터를 읽어오기
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));

        while (true) {
            String line = br.readLine();

            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        br.close();
    }
}