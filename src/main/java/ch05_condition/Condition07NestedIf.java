package ch05_condition;

import java.util.Scanner;

/*
    중첩 if문(Nested - if sentence) :
        if 문 내에 if 문이 중첩적으로 사용될 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
        if(조건식1a) {
            실행문1a
        } else if(조건식1b) {
            실행문1b
        } else if(조건식1c) {
            실행문1c
        } else {
            실행문1d
        }
        실행분1-2
    } else if(조건식1) {
        실행문2-1
            if(조건식2a) {
            실행문2a
        } else if(조건식2b) {
            실행문2b
        } else if(조건식2c) {
            실행문2c
        } else {
            실행문2d
        }
 */
public class Condition07NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>>");
        score = scanner.nextInt();

        // 중첩 if문을 활용한 grade 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");
            grade = "X";
        } else {    //이상의 조건문이 실행되지 않았따면 점수는 0 <= score <= 100일 거니까
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {            // 생략되어있지만 score가 0점 이상 59점 이하라는 의미
                grade = "F";
            }
        }

    }
}
