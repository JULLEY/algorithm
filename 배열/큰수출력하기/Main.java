package 배열.큰수출력하기;

import java.util.Scanner;

// 큰 수 출력하기
public class Main {
    public static String solution(int[] arr) {
        String answer = "";
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                answer += arr[i] + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] = new int[input + 1];

        for (int i = 1; i < input + 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }
}