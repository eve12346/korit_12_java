# Static
## 정의
    - 클래스 수준에서 변수를 정의하거나 메서드를 선언할 때 사용
    - static으로 선언된 변수나 메서드는 클래스의 '인스턴스에 속하지 않음.'(즉 객체마다 다른 값을 가지는 것이 인스턴스변수였는데, 그게 아니라 해당 클래스의 인스턴스가 전부 동일한 값을 공유함을 의미한다)
    - 클래스 자체에 속하게 됨.
    - 이는 인스턴스를 생성하지 않고 접근이 가능하다는 점에서 일반적인 field, method와 구분됩니다.

## 특징
    1. 공유 : 모든 인스턴스가 동일한 static 변수에 접근합니다. 따라서 데이터를 공유하거나 상태를 저장할 때 유용.
    2. 클래스 수준의 변수 및 메서드 : static 변수와 메서드는 클래스 로드 시 메모리에 할당(객체가 생성될 때가 아니라).

```java
// 일반 field에 미리 초기화를 해두는 방식 : 객체가 생성될 때마다 동일한 내용이 반복적으로 메모리에 할당됨.
@Setter
@Getter
public class KoreaItStaudent12 extends KoreaItStudent {

    // field 선언
    private String name;
    private int age;
    private String address;
    private String introduction = "코리아 아이티 국비 과정 12월";

}

public class Main {
    public static void main(String[] args) {
        KoreaItStudent12 student1 = new KoreaItStudent12();
        student1.setName("김일");
        student1.setAge(20);
        student1.setAddress("부산광역시 부산진구");
        System.out.println(student1.getIntroduction()); // 결과값 : 코리아 아이티 국비 과정 12월
    }
}
```
```java
// 정적 변수의 선언으로 클래스가 메모리에 마운트 될때 1번 저장.
// 이후 객체가 생성될 때마다 동일한 introduction field를 가지게 됨.
@Setter
@Getter
public class KoreaItStaudent12 extends KoreaItStudent {
    // 정적 변수 선언
    private static String introduction = "코리아 아이티 국비 과정 12월";
    // field 선언
    private String name;
    private int age;
    private String address;
    // private String introduction = "코리아 아이티 국비 과정 12월";

}

public class Main {
    public static void main(String[] args) {
        KoreaItStudent12 student1 = new KoreaItStudent12();
        student1.setName("김일");
        student1.setAge(20);
        student1.setAddress("부산광역시 부산진구");
        System.out.println(student1.getIntroduction()); // 결과값 : 코리아 아이티 국비 과정 12월
    }
}
```

이상의 KoreaItStudent12 클래스의 인스턴스들은 다 동일한 private static String '정적 변수'를 갖게 됩니다. 즉, 어느 클래스의 인스턴스인지만 확인하더라도 몇 월 국비생인지를 확인할 수 있겠네요.
    3. 인스턴스가 필요없음 : 객체를 생성하지 않고도 클래스명.field / 클래스명.메서드명() 형태로 접근이 가능합니다(이때는 private이 아니어야겠네요.)

    4. 메모리 효율성 : static 변수는 프로그램이 종료될 때까지 한 번만 메모리에 할당됨(객체가 생성될 때마다가 아니라).

