package level_06.num25083;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s =  "         ,r'\"7\n" +
                    "r`-_   ,'  ,/\n" +
                    " \\. \". L_r'\n" +
                    "   `~\\/\n" +
                    "      |\n" +
                    "      |";
        bw.write(s);
        bw.flush();
        bw.close();
    }
}
