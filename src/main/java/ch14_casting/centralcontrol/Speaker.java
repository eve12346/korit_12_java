package ch14_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커를 끕니다.");
    }
    public void changeEqual() {
        System.out.println("스피커의 이퀄라이저를 변경합니다.");
    }
}
