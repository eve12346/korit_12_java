package ch17_static.singleton.product;

public class ProductView {
    // 정적 변수를 선언 - field
    // 보통 싱글톤 패턴 만들 때 정적 변수 이름이 instancd입니다.
    // -> 24년 1회 실기 시험 시 field 명도 힌트였습니다.
    private static ProductView instance;
    public static int count = 1;

    // 얘는 생성자
    private ProductView() {
        int cnt = 1;    //이거 ㄴ객체 생성시에 사용되는 field네요
        System.out.println(cnt + " 번 째 객체가 생성되었습니다.");
        cnt++;
        System.out.println("정적 변수를 참조한느 " + count + "번 째 객체가 생성되었습니다.");
        count++;
    }

    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }
}
