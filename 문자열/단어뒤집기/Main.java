package 문자열.단어뒤집기;

import java.util.Scanner;

// 단어뒤집기
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String words[] = new String[input];

        for(int i = 0; i < input; i++){
            words[i] = sc.next();
        }

        for(String x : words){
            String temp = new StringBuilder(x).reverse().toString();
            System.out.println(temp);
        }
    }
}