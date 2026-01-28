package self_test;

import java.util.Scanner;

public class Distribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        int odd = 0;
        int even = 0;

        for ( int i = 0 ; i < 10 ; i ++) {
            System.out.print((i+1) + "번째 정수를 입력해 주세요 :");
            arr[i] = scanner.nextInt();
        }

        for ( int i = 0 ; i < 10 ; i ++) {
            if ( arr[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("홀수의 갯수:" + odd + "\n짝수의 갯수:" + even);
    }
}
