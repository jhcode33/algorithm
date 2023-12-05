package baekjoon.level_04.num3052;

import java.io.*;
import java.util.HashSet;

public class HashSetSolve {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(Integer.parseInt(br.readLine()) % 42);
        }
        bw.write(String.valueOf(hashSet.size()));
        bw.flush();
        bw.close();
    }
}
