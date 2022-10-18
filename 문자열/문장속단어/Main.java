package 문자열.문장속단어;

import java.util.Scanner;

// 문장 속 단어
public class Main {
    public static String solution(String str) {
        String[] words = str.split(" ");
        String answer = "";
        int maxLen = 0;
        for (String x : words) {
            if (maxLen < x.length()) {
                maxLen = x.length();
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(solution(str));
    }
}