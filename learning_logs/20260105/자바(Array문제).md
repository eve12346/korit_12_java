1. 
- 실행 예
  -  김일 / 김이 / 김삼 /
  -  이라고 콘솔에 출력될 수 있도록 main 에 작성하시오.

```java
public class Array04 {
    public static void main(String[] args) {
        String[] titles = {"김일", "김이", " 김삼"};
        for ( int i = 0 ; i < titles.length ; i ++) {
            System.out.print(titles[i] + " / ");
        }
        System.out.println();
        Array04 array04 = new Array04();
        array04.printElement(titles);       // argument로 titles라는 String[] 배열을 넣습니다
    }

    public void printElement(String [] names) { // 매개변수로 names라는 String[]을 집어넣기로 정의합.
        for ( int i = 0 ; i < names.length ; i ++) {
            System.out.print(names[i] + " / ");
        }
        System.out.println();




    }
}
```
2. 
- 메서드로 정의하셔도 되고, main에 바로 해도 상관없는 과제
- String[] scores 배열에
A / B / C / D / F element로 초기화하고
- 실행 예
A+ / B+ / C+ / D+ / F
가 되도록 코드를 작성하시오.

```java
public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A", "B", " C", "D" , "F"};
        for (int i = 0 ; i < scores.length - 1 ; i ++) {
            System.out.print(scores[i] + "+ / ");
        }
        System.out.println(scores[scores.length-1]);
    }

    // addPlus() 메서드로 정의하시오 - 과제

    public void addPluss() {

    }
}
```
3. 
- int[] scores = [ 100 ,90 ,80, 70, 60, 50, 40, 30, 20, 10];
- 총합과 평균을 계산해서 다음과 같이 출력하시오.
- 총점 : 뭐 몇점
- 평균 : 뭐 몇점 ( 주의사항: double 형변환을 적용하셔야 합니다)

- 총합을 내는 메서드 - calcSum()
- 평균을 내는 메서드 - calcAvg()
- 총합과 평균을 출력하는 곳에서 두 개의 메서드를 호출하는 방식으로도 작성가능하겠네요
- printSumAndAvg()
```java
public class Array06 {
    public static void main(String[] args) {
        int[] scores = {100 ,90 ,80, 70, 60, 50, 40, 30, 20, 10};
        int sum = 0;
        double avg = 0;
        for ( int i = 0 ; i < scores.length ; i++){
            sum += scores[i];
        }
        avg = (double)sum / scores.length ;

        System.out.println("총점 : " + sum + "점");;
        System.out.println("평균 : " + avg + "점");

        Array06 array06 = new Array06();
        array06.printSumAndAvg(scores);
    }

    private double clacSum(int[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();  // sum이 int인 상황에서는 소수점이 나오지 않을 것 같습니다.
        return sum;
    }

    private double calcAvg(int[] scores) {
        double avg = 0;
        avg = Arrays.stream(scores).average().getAsDouble();    // 마찬가지
        return avg;
    }

    // method overloading을 통해서 int[] 배열만 받는게 아니라 double[]배열을 받더라도 연산을 할 수 있도록 준비

    public void printSumAndAvg(int[] score) {
        double sum = clacSum(score);
        double avg = calcAvg(score);

        System.out.println("총점 : " + sum+ "점\n평균 : " + avg + "점");
    }
}
```
4. 
- 이하의 socres 배열의 값을 탐색하여
    - 90이상은 A
    - 80이상은 B
    - 70이상은 C
    - 60이상은 D
    - 59이하은 F

- 실행 예
    - A 등급 몇 명
    - B 등급 몇 명
    - C 등급 몇 명
    - ...
    - F 등급 몇 명
```java
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


