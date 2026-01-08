package ch14_casting.centralcontrol;

public class AirConditioner implements Power {
    @Override
    public void on() {
        System.out.println("에어컨 리모컨을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("에어컨 리모컨을 끕니다");
    }

    // 고유 메서드 정의(downcasting을 위해서)
    public void changeMode() {
        System.out.println("에어컨의 모드를 바꿨습니다.");
    }

}
