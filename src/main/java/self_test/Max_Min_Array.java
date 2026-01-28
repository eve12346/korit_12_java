package self_test;

import java.util.Scanner;

public class Max_Min_Array {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // 배열 크기 입력
                System.out.print("배열의 크기를 입력하세요: ");
                int n = sc.nextInt();

                int[] arr = new int[n];

                // 배열 값 입력
                System.out.println(n + "개의 숫자를 입력하세요:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                // 최댓값과 최솟값 초기화
                int max = arr[0];
                int min = arr[0];

                // 배열 순회하면서 최댓값, 최솟값 찾기
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }

                // 결과 출력
                System.out.println("최댓값: " + max);
                System.out.println("최솟값: " + min);

                sc.close();
    }
}
