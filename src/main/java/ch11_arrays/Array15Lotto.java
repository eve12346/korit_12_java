package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1~45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 아뇜. -> 저랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 시작하겠습니다.

    lottoNumbers에 1 ~ 45까지의 수샂 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다.(혹시 while문으로 작성하고싶다면
    그래도 됩니다)
 */
public class Array15Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6];

        for ( int i = 0 ; i < 6 ; i++) {
            for ( int j = 0 ; j < lottoNumbers.length ; j++) {
                lottoNumbers[j] = random.nextInt(45) + 1;
            }
            System.out.println((i+1) + "차 로또 번호 : " + Arrays.toString(lottoNumbers));
        }
    }
}
