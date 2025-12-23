package ch06_loops;
/*
    1부터 100까지 출려하시오.
    실행 예
    1
    2
    3
    ...
    100
 */
public class Loop02While {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 101) {
//            System.out.println(i++);
//        }
        /*
            2번 문제
            1 2 3 4 5 6 ... 10
            11 12 13 ... 20
            ...
            91 92 ... 100
            으로 출력하시오.
         */
        int i = 0;
        while (i < 100) {
            System.out.print(i++ + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("2번 풀이");
        /*
            힌트 : 1 2 3 4 5 6 ... 10 을 출력하는 게 한 번의 반족
            힌트 # 2 : 첫 번째 반복의 경우 첫 번째 변수가 1로 시작하는데,
                두 번째 반복의 첫 번째 변수는 11이네요.
                세 번째는 21
                10씩 차이가 나네요.
                그럼 10씩 더하면 된다
                단 코드가 길고 안이쁨
         */
        int a = 1;
        while (a < 101) ;
        {
            System.out.println(a + " " + (a + 1) + " " + (a + 2) + " " + (a + 3) + " " + (a + 4) + " " + (a + 5) + " " + (a + 6) + " " + (a + 7) + " " + (a + 8) + " " + (a + 9) + " ");
            a += 10;
        }
    }
}

