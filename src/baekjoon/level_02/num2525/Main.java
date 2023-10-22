package baekjoon.level_02.num2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int inputHour = Integer.parseInt(st1.nextToken());
        int inputMin = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cookTime = Integer.parseInt(st2.nextToken());

        int totalTime = inputHour * 60 + inputMin;
        totalTime += cookTime;

        int hour = (totalTime / 60) % 24;
        int min = totalTime % 60;

        System.out.println(hour + " " + min);
    }
}
