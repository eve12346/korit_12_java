## Constructor
```java
public class Constructor {
    // 필드 선언
    int num;
    String name;
    /*
        기본 생성자 정의 -> 원래 default로 만들어집니다.
        그리고 매개변수의 유무만 있고 return이 없어서 call1() / call2() 유형밖에 없죠
        그 말은 어차피 return 없어서 void니까 void를 명시하지 않습니다.
        그리고 기본 생성자는 매개변수가 없으니까 method 적으로는 call1()
        유형에 해당합니다.
     */
    public Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");

    }
    // 배개변수 생성자
    public Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number; // this : 해당 클래스에서 객체를 생성하게 되며녀 객체 이름으로 대체됨.

    }
}
```
## ConstructorMain
```java
package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(2);
        System.out.println(constructor2.num);
        // 아까 전에는 myCar 객체를 생성하고 그 다음에 빨강이라는 값을 color에
        // 대입했습니다.
        // 근데 잘 생각해보면 아니 만들면서 곧장 color는 빨강이라고 지정할 수 없는건가에
        // 해당하는겁니다
        // Car myCar = new Car("빨강");

    }
}
```