package ch18_generic.bmi;

public class Bmi {

    private double calcBmi(Person person) {
        double bmi = 0;
        String name = person.getName();
        double height = person.getHeight() * 0.01;  // 여기서만 m법으로 쓰니까 별개의 변수를 선언하지 않았습니다.
        double weight = person.getWeight();

        bmi = weight / (height*height);
        System.out.println(bmi);
        return bmi;
    }

    public void printResult(Person person) {
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();
        double bmi = calcBmi(person);   // 올바른 결과라면 0 미만 같은거 쓸 필요 없겠네요
        String result = "";
        if ( bmi < 18.5 ) {
            result = "저체중";
        } else if ( bmi < 23 ) {
            result = "정상";
        } else if ( bmi < 25 ) {
            result = "비만 전 단계";
        } else if ( bmi < 30 ) {
            result = "1 단계 비만";
        } else if ( bmi < 35 ) {
            result = "2 단계 비만";
        } else {
            result = "3 단계 비만";
        }
        System.out.println(name + " 님의 키는 " + height + " cm이고 몸무게는 " + weight + " kg이고, bmi 지수는 " + bmi + " 으로 " + result + "입니다." );
    }
}
