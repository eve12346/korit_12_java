ch18_generic 밑에 bmi 패키지를 생성하시오.

Person 클래스를 정의하고 field를 String name / double height / double weight로 작성하시오. PersonMain 클래스를 생성하시오. Bmi 클래스를 생성하고 method로 calcBmi(Person person); 형태로 정의하시오. -> return type double

printResult(double bmi)를 적용하고 조건문을 사용하여

김일 님의 키는 xxx cm, 몸무게는 xxx kg, bmi 지수는 xxx 으로 저체중/정상/비만전단계/1단계비만/2단계비만/3단계 비만입니다. 라고 출력할 수 있도록 작성하시오.
PersonMain에서 Person 객체 생성, Bmi 객체를 생성한 후 calcBmi() 및 printResult()를 호출하시오.

```java
package ch18_generic.bmi;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("김일", 166, 52);
        Bmi bmi1 = new Bmi();
        bmi1.printResult(person1);

        // 이상과 같이 작성했을 때 멀쩡하게 동작합니다.



    }
}
```