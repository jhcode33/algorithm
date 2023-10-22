package baekjoon.level_05.num10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // a~z까지의 알파벳에 대한 배열이다
        int[] arr = new int[26];

        // 알파벳 배열의 모든 위치를 -1로 초기화 시킨다
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        // 문자열을 입력 받는다
        String word = br.readLine();

        // 문자열의 길이만큼 돌면서, a의 아스키 코드 값을 빼서, 배열의 위치랑 일치 시킨다
        // 단어의 첫 문자가 a라면 소문자 a의 아키스코드 값을 빼면 0이 될 것이다.
        // 그렇다면 배열에서 0번째 위치를 a라고 정했기 때문에 해당 값을 변경해주면 된다.
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int value : arr) {
            bw.write(String.valueOf(value) + " ");
        }
        bw.flush();
        bw.close();
    }
}
