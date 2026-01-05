package ch11_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03Method {
    //이름만 받는 메서드
    private String[] inputNames() { // 이 메서드를 호출했을 때 배열의 한계값도 입력하고 이름들도 입력하게끔 -> call3()
        Scanner scanner = new Scanner(System.in);
        String[] names;
        int num = 0;

        System.out.print("몇 명의 학생을 입력하시겠습니까? >>> ");
        num = scanner.nextInt();
        scanner.nextLine();
        names = new String[num];
        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + " 번 째 학생의 이름을 입력하세요 >>> ");
            names[i] = scanner.nextLine();
        }
        return names;
    }

    private  double[] inputScores(String[] titles) {   // 굳이 얘도 call3()로 한 다음에 Scanner를 또 객체 생성할 필요가 있는가.
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[titles.length];
        for ( int i = 0 ; i < scores.length ; i ++) {
            System.out.print(titles[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }

    public void writeNameAndScore() {
        String[] names = inputNames();              // inputNames() 메서드의 return형이 String 배열이니까 배열 선언해서 초기화
        double[] scores = inputScores(names);       // inputScores() 메서드는 String 배열을 argumnet로 요구하니까 포함하고,
                                                    // 실수 배열 선언 후 초기화

        System.out.println("학생들의 점수 총합은 " + Arrays.stream(scores).sum() + "점입니다.");
        System.out.println("학생들의 점수 평균은 " + Arrays.stream(scores).average().getAsDouble() + "점입니다.");
    }

    // 금일 자습 시간 혹은 면담 시간 중에 여러분들이 할 일
    // inputNum() 메서드를 정의해서 배열의 한계값들을 입력 받는 메서드를 구현하고
    // inputNames()에서 한계값 설정하는 부분을 다 분리한 후에
    // 동일한 실행 예가 나올 수 있도록 개조하시오.

    // 그 경우 method overloading을 통해 inputScores에 String[] 이 매개변수인 경우와
    // int num이 매개변수인 경우로 나누어 inputScores()의 매개변수가 무엇이냐에 따라
    // 이름 학생의 점수를 입력하세요 >>> 가 나오거나,
    // n 번째 학생의 점수를 입력하세요 >>> 가 나올 수 있도록 하시오.

    public static void main(String[] args) {
        // 동일한 클래스라도  'static'을 붙이지 않으면 객체 생성을 해야지 메서드 호출 가능
        Array03Method array03Method = new Array03Method();
    }
}
