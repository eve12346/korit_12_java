package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        // 1부터 100까지의 숫자 중 홀수 합만 구하는 for문을 작성하시오.
        // 힌트1 : for문 내에 if가 들어갈 수 있음
        // 힌트2 : 근데 if문 안쓰고도 홀수 합만을 구하는 것이 가능하긴 함.

        int sum1 = 0;
        for ( int num1 = 1 ; num1 < 101 ; num1+=2) {
            sum1 += num1;
        }
        System.out.println(sum1);

        int sum2 = 0;
        for ( int num2 = 0; num2 < 101 ; num2++) {
            if ( num2 % 2 == 1) {
                sum2 += num2;
            }
        }
        System.out.println(sum2);

        /*
            여러분들이 숫자 관련 변수 볼 때 i를 보는 경우가 많습니다.
            i는 index의 축약어로 쓰입니다. 그 뒤 알파벳 j, k ...으로 중첩 반복문에서 변수명을 선호되는 편

            숫자를 입력 받아서 1부터 n까지 더하는 반복문을 작성
            실행 예
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int sum3 = 0;
        int k = scanner.nextInt();
        for (int num3 = 1; num3 < (k+1) ; num3++) {
            sum3 += num3;
        }
        System.out.println("1부터" + k + "까지의 합은 " + sum3 + "입니다.");

        int sum4 = 0;
        sum4 = k*(k+1)/2 ;
        System.out.println(sum4);

    }
}
