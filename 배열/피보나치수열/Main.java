package 배열.피보나치수열;

import java.util.Scanner;

// 피보나치수열
public class Main {
    public static void solution(int size, int[] arr) {

        arr[0] = 1; arr[1] = 1;
        for (int i = 0; i < size - 2; i++) {
            arr[i+2] = arr[i] + arr[i+1];
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        solution(size, arr);
    }
}