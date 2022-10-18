package 배열.가위바위보;

import java.util.Scanner;

// 가위바위보
// 5
// 2 3 3 1 3
// 1 1 2 2 3
// 1:가위, 2:바위, 3:보
// 비겼을 경우 D
public class Main {
    public static void solution(int size, int[] arr1, int[] arr2) {
        String result = "";

        for(int i = 0; i < size; i++){
            result += (arr1[i] == arr2[i]) ? "D" : ((1 == arr1[i] && 3 == arr2[i]) || (2 == arr1[i] && 1 == arr2[i]) || (3 == arr1[i] && 2 == arr2[i])) ? "A" : "B";
        }

        for(char x : result.toCharArray()){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        solution(size, arr1, arr2);
    }
}