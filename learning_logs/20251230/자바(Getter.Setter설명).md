# Getter / Setter
## Getter / Setter의 필요성

1. 문제 상황
    - 클래스를 하나 만든다고 가정하겠습니다. 예를 들어 Person
    클래스를 생성하면서, 이름, 나이 등의 정보를 저장하기 위해
    이름, 나이 등의 정보를 저장하기 위해field를 선언합니다

```java
public class Person {
    String name;
}

public class Personmain {
    Public static void main(String[] args) {
        Person person1 = new Person();  // 이게 객체 생성
        // 객체에 값을 대입하는 방법
        // 객체명. 필드명 = 데이터;
        person.name = "김일";
        person1.age = -10;

        System.out.prinln(person1.name); // 결과값 : 김일
        System.out.println(person1.age); // 결과값 : -10
    }
}
```

이상의 코드를 확인했을 때, 나이가 정상적이지 않은 값이 대입되어있습니다. 이처럼 외부 (다른 클래스)에서 직접 속성값을 대입하게 될 때, 이상한 값이 들어가더라도 통제할 수 있는 방법이 없다는 문제가 있습니다. -> 이를 해결하기 위한 방법이 getter /setter개념입니다

## Getter / Setter란?
1. Setter
    - 데이터를 '설정' 하는 역할을 하는 'method.' 클래스 외부에서 필드를 직접 수정하지
    못하도록 막고, 특정 메서드를 경유하여 값을 전달받아 '초기화 및 수정'을 하도록 함

2. Getter
    - 데이터를 '조회'하는 역할을 'method.' 클래스 외부에서 필드를 직접 읽지 못하도록
    막고, 특정 메서드를 경유하여 안전하게 값을 '반환(return)' 하도록 함.

3. 장점:
    1. 데이터 보호
        - 변수가 private 접근 제어자(추후수업 예정)를 사용하여 외부에서 직접
        접근하지 못하게 함으로써 데이터를 보호할 수 있음.
    2. 데이터의 유효성 검증(아까 -10 같은 데이터를 걸러내는 역할입니다)
        ` setter 메서드에서 입력된 데이터가 적합한지 확인하고, 잘못된 값을 거절할 수 있음.
    3. 캡슐화(encapulation)
        - 데이터를 숨기고 필요한 경우에만 제한적으로 접근할 수 있어 클래스 내부구현을 외부로
        노출하지 않음.
    4. 유연성 증가
        - 나중에 요구 사항이 바뀌어 데이터를 설정하거나 조회하는 방법이 달라지더라도 클래스(Main 말고) 내부의 메서드만 수정하면 되므로 유지 보수가 쉬어짐.
    
## Setter / Getter의 구조
### Setter
```java
public void set속성명1(자료형 변수명) {
    this.속성명1 = 변수명;
}

public void setName(String name) {
    this.name = name;
}
```

### Getter

```java
public 자료형 get속성명1() {
    return 속성명1;
}

public int getAge() {   //field와 getter의 자료형이 일치해야 합니다.
    retuen age;
}
```