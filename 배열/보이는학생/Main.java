package 배열.보이는학생;

import java.util.Scanner;

// 보이는 학생
public class Main {
    public static int solution(int[] arr) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }
        return cnt;
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