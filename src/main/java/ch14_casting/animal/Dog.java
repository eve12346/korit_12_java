package ch14_casting.animal;

public class Dog extends Animal {
    @Override
    public void makeSount() {
        System.out.println("개가 짖습니다.");
    }

    // Dog 클래스이 고유 메서드
    public void fetch() {
        System.out.println("강아지가 공을 물어옵니다.");
    }
}
