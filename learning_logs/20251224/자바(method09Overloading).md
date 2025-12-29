```java
package ch07_methods;

import java.util.Scanner;

public class Method09Overloading {
    // call1() 유형으로 정의
    public void add() {
        System.out.println("add()");
    }
    // overloading 적용
    // call2() 유형 # 1
    public void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s + "🎈");
    }
    // call2() 유형 # 2
    public void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println(a + b);
    }
    // call2() 유형 # 3
    public void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s + " / " + a);
    }
    // 이하의 코드는 overloading에서 매개변수의 자료형이 아니라 return 타입도
    // 바꿔서 작성했습니다.
    public String add(String s1, String s2) {
        String result = s1 + s2;
        return result;
    }

    public static void main(String[] args) {
        // 객체 생성
        Method09Overloading method1 = new Method09Overloading();
        // method 호출
        method1.add();
        method1.add("안녕하세요");
        method1.add(2, 3);
        method1.add("배고프다", 3);
        System.out.println(method1.add("햄버거가 ", "먹고싶다."));
    }
}
```