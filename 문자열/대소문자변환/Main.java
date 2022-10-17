package 문자열.대소문자변환;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){
            int ascii = (int) x;
            answer += (ascii >= 65 && ascii <= 90) ? Character.toLowerCase(x) : Character.toUpperCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
        return;
    }
}