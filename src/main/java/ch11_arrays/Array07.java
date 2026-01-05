package ch11_arrays;
/*
    이하의 socres 배열의 값을 탐색하여
    90이상은 A
    80이상은 B
    70이상은 C
    60이상은 D
    59이하은 F

    실행 예
    A 등급 몇 명
    B 등급 몇 명
    C 등급 몇 명
    ...
    F 등급 몇 명
 */
public class Array07 {
    public static void main(String[] args) {

        // 풀이법 # 1
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] > 89) a++;
                else if (scores[i] > 79) b++;
                else if (scores[i] > 69) c++;
                else if (scores[i] > 59) d++;
                else f++;
            }
        }
        System.out.println("A :" + a + "명");
        System.out.println("B :" + b + "명");
        System.out.println("C :" + c + "명");
        System.out.println("D :" + d + "명");
        System.out.println("F :" + f + "명");

        // 풀이법 # 2
        System.out.println();                   // 띄어쓰기
        int[] grades = {0 ,0 ,0 ,0 ,0};

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) break;
            else {
                if (scores[i] > 89) grades[0]++;
                else if (scores[i] > 79) grades[1]++;
                else if (scores[i] > 69) grades[2]++;
                else if (scores[i] > 59) grades[3]++;
                else grades[4]++;   // [i]가 아니라 [0]으로 하드코딩해야합니다
            }
        }
        System.out.println("A :" + grades[0] + "명");
        System.out.println("B :" + grades[1] + "명");
        System.out.println("C :" + grades[2] + "명");
        System.out.println("D :" + grades[3] + "명");
        System.out.println("F :" + grades[4] + "명");
    }
}