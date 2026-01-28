package self_test;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 첫 수를 입력해 주세요 :");
        int n = scanner.nextInt();
        for (int i = 1 ; i <= 9; i ++) {
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
}
