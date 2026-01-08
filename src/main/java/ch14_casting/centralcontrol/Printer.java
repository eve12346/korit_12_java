package ch14_casting.centralcontrol;

public class Printer implements Power{
    @Override
    public void on() {
        System.out.println("프린터를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("프린터를 끕니다.");
    }
    public void print() {
        System.out.println("프린터가 인쇄를 합니다.");
    }

}
