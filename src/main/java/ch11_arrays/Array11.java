package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    아까 random.nextInt();를 한 번 써봤습니다.
    그래서 Integer[] numbers 배열을 선언하고 10 개 짜리 index로 만듭니다.
    그리고 0번지부터 9번지까지 nextInt[];를 반복 실행하여
    numbers 내에 임의의 정수를 넣어주겠습니다.

    그리고 그 배열을 출력합니다.
    오름차순으로 출력합니다.
    내림차순으로 출력합니다.

    각 element를 뽑아서 10씩 곱합니다.
    향상된 for문으로 element를 출력합니다 -> 1239087 / 13409578 / -584976395 / ...

   끝
 */
public class Array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Integer[] nums = new Integer[10];

        for ( int i = 0 ; i < nums.length ; i++) {
            nums[i] = random.nextInt();
        }

        System.out.println("정렬 전 : " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 후 : " + Arrays.toString(nums));

        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내림 차순 정렬 후 : " + Arrays.toString(nums));

        for (int num : nums) {
            System.out.print(num + " / ");
        }
    }
}
