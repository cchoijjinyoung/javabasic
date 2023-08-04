package Work;

import java.util.HashMap;

public class Work2_ver2 {
    /**
     * 깜짝과제 2 - HashMap 으로 풀어보기.
     * 풀고난 후 : (char)를 통해 형변환을 하는 코드가 많아지는 것 같다.
     */

    public static void main(String[] args) {
        String filePath = "C:\\Users\\cgy71\\Desktop\\study\\javabasic\\src\\Work\\textsample.txt";

        FileUtils fileUtils = new FileUtils();

        String fileText = fileUtils.getLoadText(filePath);
        fileText = fileText.toUpperCase();

        HashMap<Character, Integer> alphCnt = new HashMap<>();

        int totalCnt = 0;

        for (int i = 0; i < fileText.length(); i++) {
            char c = fileText.charAt(i);
            alphCnt.put(c, alphCnt.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < 26; i++) {
            totalCnt += alphCnt.get((char)('A' + i));
        }

        for (int i = 0; i < 26; i++) {
            double rate = (double) alphCnt.get((char)('A' + i)) / totalCnt * 100;
            String format = String.format("%c = %6d, \t %.2f%%", (char)('A' + i), alphCnt.get((char)('A' + i)), rate);
            System.out.println(format);
        }
    }
}
