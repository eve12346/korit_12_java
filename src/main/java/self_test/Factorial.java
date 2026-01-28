package self_test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int n = scanner.nextInt();
        int num = 1;
        for (int i = 1 ; i <= n ; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}
