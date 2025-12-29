## Car
```java
package ch08_classes;

public class Car {
    // 필드 선언
    String color;
    int speed;
    // 메서드 정의
    public void drive() {
        System.out.println(color + " 자동차가 주행중입니다.");
    }

    public void brake() {
        System.out.println(color + " 자동차가 멈췄습니다.");
    }
    public void displayInfo() {
        System.out.println("이 차의 색깔은 " + color + "색이고,");
        System.out.println( "최고 속도는 " + speed + "km/h입니다");
    }
    /*
        Car의 인스턴스인 myCar라는 객체를 생성하시오.
        color 빨강, speed에 160을 대입하시오.
        yourCar에 노랑, 180을 대입하시오.
        myCar는 drive() 메서드 호출
        yourCar는 brake() 메서드 호출
        myCar, yourCar에 각각 displayInfo() 메서드를 호출하시오.
     */
}
```

## CarMain
```java
package ch08_classes;

public class CarMain {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        Car yourCar = new Car();

        // 필드에 값 대입
        myCar.color = "빨강";
        myCar.speed = 160;
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.brake();

        myCar.displayInfo();
        yourCar.displayInfo();

    }
}
```