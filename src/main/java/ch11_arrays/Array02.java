package ch11_arrays;

import java.util.Scanner;

/*
    1. humans 배열에 이름을 입력할 수 있도록 할겁니다.
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5    -> 이거 이후에 배열이 생성됨
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

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
//        int num = scanner.nextInt();
//        scanner.nextLine();
//
//        String[] humans = new String[num];
//        double[] scores = new double[num];
//
//        for (int i = 0; i < (num); i ++) {
//            System.out.print((i+1) + "번 학생의 이름을 등록하세요 >>> ");
//            humans[i] = scanner.nextLine();
//        }
//        System.out.println();
//
//        double sum = 0;
//        for (int i = 0; i < (num); i ++) {
//            System.out.print(humans[i] + "번 학생의 점수를 입력하세요 >>> ");
//            double score = scanner.nextDouble(); {
//            }
//            sum += score;
//        }
//        System.out.println();
//        System.out.println("학생들의 총합 점수는 " + sum + " 입니다.");

        // mothod파트
       Array03Method array03Method = new Array03Method();
       array03Method.writeNameAndScore();

    }
}
