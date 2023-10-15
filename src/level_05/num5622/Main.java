package level_05.num5622;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int count = 0;
        int length = word.length();

        for (int i = 0; i < length; i++) {

            switch (word.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                    count += 3;
                    break;

                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
