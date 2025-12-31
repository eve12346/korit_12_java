package ch11_arrays;

import java.util.Scanner;

/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    2 번 학생의 이름을 등록하세요 >>> 김이
    3 번 학생의 이름을 등록하세요 >>> 김삼
    4 번 학생의 이름을 등록하세요 >>> 김사
    5 번 학생의 이름을 등록하세요 >>> 김오

    2. scores 배열에 점수를 입력할 수 있도록 할겁니다
    1 번 학생의 점수를 입력하세요 >>> 4.5
    2 번 학생의 점수를 입력하세요 >>> 4.4
    3 번 학생의 점수를 입력하세요 >>> 4.3
    4 번 학생의 점수를 입력하세요 >>> 4.2
    5 번 학생의 점수를 입력하세요 >>> 4.1

    학생들의 총합 점수는 21.5점 입니다.
 */
public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int[] human = new int[(scanner.nextInt())];
        for (int i = 1; i < (human.length+1); i ++) {
            System.out.print(i + "번 학생의 이름을 등록하세요 >>> ");
            String name = scanner.next();
        }
        System.out.println();
        double sum = 0;
        for (int i = 1; i < (human.length+1); i ++) {
            System.out.print((i) + "번 학생의 점수를 입력하세요 >>> ");
            double score = scanner.nextDouble(); {
            }
            sum += score;
        }
        System.out.println();
        System.out.println("학생들의 총합 점수는 " + sum + " 입니다.");
    }
}
