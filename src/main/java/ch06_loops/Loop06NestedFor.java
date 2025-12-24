package ch06_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다
    for ( int i = 0 ; i < 100 ; i ++ ) {
        반복실행문1-a
        for ( int j = 0 ; j < 100 ; j++ ) {
            반복실행문2
        }
        반복실행문1-b
    }
    for 문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오
    다 하면 구구단 for문으로 출력하시오.
 */
public class Loop06NestedFor {
    public static void main(String[] args) {
//        for (int i = 1; i < 6 ; i++) {
//        } for (int j = 1; j < 4; j++) {
//            System.out.print( i + "일차" + j + "교시입니다.");
//            }

        /*
            1 2 3 4 5 ... 10
            11 ... 20
            91 ... 100
         */
        //풀이법 1 : 100번 반복하는 방법
//        for (int i = 1 ; i < 101 ; i++) {
//            System.out.print(i + " ");      // 반복실행문1-a
//            if(i % 10==0) {                 // 중첩 for문 응용
//                System.out.println();
//            }
//        }
//
//        // 풀이법 2 : 10번 반복
//        for ( int j =1 ; j < 101 ; j+=10) {
//            System.out.print(j + " " + (j+1)+ " " + (j+2)+ " " + (j+3)+ " " + (j+4)+ " " + (j+5)+ " " + (j+6)+ " " + (j+7)+ " " + (j+8)+ " " + (j+9)+ " ");
//        }
        /*
            숫자를 입력 받아서 홀수만 더하는 for 반복문을 작성하시오
            다 했으면 짝수만 구하는 for 반복문을 작성하시오
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 >>> ");
        int i = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int j = 1; j < i+1; j+=2 ) {
            sum1 += j;
        }
        for(int k = 1; k < i+1; k+=1) {
            sum2 += k;
        }
        System.out.println("홀수의 합은 "+ sum1 + "입니다");
        System.out.println("짝수의 합은 " + sum2 + "입니다");
    }
}

