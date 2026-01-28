package self_test;

import java.util.Scanner;

public class Num_Find {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 배열 크기 고정
        int[] arr = new int[5];

        // 배열 값 입력
        System.out.println("정수 5개를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 찾을 값 입력
        System.out.print("찾을 값을 입력하세요: ");
        int target = scanner.nextInt();

        // 배열에서 값 찾기
        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // 결과 출력
        if (found) {
            System.out.println("찾는 값이 있습니다.");
        } else {
            System.out.println("찾는 값이 없습니다.");
        }
        scanner.close();
    }
}