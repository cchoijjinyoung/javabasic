package Work;

public class Work2 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cgy71\\Desktop\\study\\javabasic\\src\\Work\\textsample.txt";

        FileUtils fileUtils = new FileUtils();

        String fileText = fileUtils.getLoadText(filePath);
        fileText = fileText.toLowerCase();

        int[] alphCnt = new int[26];
        int totalCnt = 0;

        for (int i = 0; i < fileText.length(); i++) {
            char c1 = fileText.charAt(i);

            if (c1 == 'a') { alphCnt[c1 - 97]++; }
            else if (c1 == 'b') { alphCnt[c1 - 97]++; }
            else if (c1 == 'c') { alphCnt[c1 - 97]++; }
            else if (c1 == 'd') { alphCnt[c1 - 97]++; }
            else if (c1 == 'e') { alphCnt[c1 - 97]++; }
            else if (c1 == 'f') { alphCnt[c1 - 97]++; }
            else if (c1 == 'g') { alphCnt[c1 - 97]++; }
            else if (c1 == 'h') { alphCnt[c1 - 97]++; }
            else if (c1 == 'i') { alphCnt[c1 - 97]++; }
            else if (c1 == 'j') { alphCnt[c1 - 97]++; }
            else if (c1 == 'k') { alphCnt[c1 - 97]++; }
            else if (c1 == 'l') { alphCnt[c1 - 97]++; }
            else if (c1 == 'm') { alphCnt[c1 - 97]++; }
            else if (c1 == 'n') { alphCnt[c1 - 97]++; }
            else if (c1 == 'o') { alphCnt[c1 - 97]++; }
            else if (c1 == 'p') { alphCnt[c1 - 97]++; }
            else if (c1 == 'q') { alphCnt[c1 - 97]++; }
            else if (c1 == 'r') { alphCnt[c1 - 97]++; }
            else if (c1 == 's') { alphCnt[c1 - 97]++; }
            else if (c1 == 't') { alphCnt[c1 - 97]++; }
            else if (c1 == 'u') { alphCnt[c1 - 97]++; }
            else if (c1 == 'v') { alphCnt[c1 - 97]++; }
            else if (c1 == 'w') { alphCnt[c1 - 97]++; }
            else if (c1 == 'x') { alphCnt[c1 - 97]++; }
            else if (c1 == 'y') { alphCnt[c1 - 97]++; }
            else if (c1 == 'z') { alphCnt[c1 - 97]++; }

        }

        for (int i = 0; i < alphCnt.length; i++) {
            totalCnt += alphCnt[i];
        }

        for (int i = 0; i < alphCnt.length; i++) {
            double rate = (double) alphCnt[i] / totalCnt * 100;
            System.out.printf("%c = %6d, \t %.2f%%", i + 65, alphCnt[i], rate);
            System.out.println();
        }
    }
}
