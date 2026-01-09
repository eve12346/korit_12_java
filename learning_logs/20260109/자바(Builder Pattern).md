# Builder Pattern(빌더 패턴)
```java
@AllArgsConstructor
public class Student {
    private int code;
    private String name;
    private String gender;
    private String school;
    private int semester;
    private Strig[] subjects;
    private double[] scores;
}
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(여기 내부에 모든 field를 순서대로 작성해야 합니다);
    }
}
```

## 빌더 패턴이 생기게 된 원인
1. 복잡한 생성자 문제
    - 객체의 field가 많아질 수록 생성자 매개변수 수도 늘어남.
        - 저희는 롬복 쓰니까 생성자 코드 라인이 적을 수 있지만
        - 필수적인 부분에 @NonNull이나 final을 써야하고, 그 와중에 final 쓰면 기본 생성자는 못만드는 등 여러가지 제약이 있습니다.
2. 생성자 오버로딩 문제
    - 생성자에 필요한 조합이 다를 경우 수많은 생성자를 하나씩 정의해야 합니다.
        - 예를 들어 옛날 회원가입의 경우 집전화와 폰번호가 필수였는데, 오늘날에는 집전화는 optional인 상태죠. 그럼 처음에는 homePhone field 넣었었다가 나중에는 뺐다가 그러면 거기에 맞춰서 생성자도 homePhone field를 넣어놨었는데 나중에는 그거 삭제해야하고 하여튼 귀찮은 상황이 발생합니다.
    - 유지보수에 악영향 / 예를 들어서 field 하나 추가하면 allArgsConstructor가 아니게 되니까 다 뜯어 고쳐야겠네요. 저희가 volumeUpButton 추가했을 때 생성자 뜯어내고 Main에서 생성자 호출할 때도 오류 수정했던 것을 떠올리면 되겠습니다.

3. 가독성 문제
    - 코드를 작성하고 읽는 입장에서는 객체를 생성할 때 어떤 값이 어떤 field에 해당하는지 명확하지 않아서 실수를 유발할 수 있음.

```java
public static void main(String[] args) {
    Student student = new Student("김일","김이");
}
```
// 라고 했을 때 얘가 김일 학생인데 김이 초등학교인지 김일 초등학교인데 김이 학생인지 알수가 없다는 것입니다.

## 정의
객체의 생성과정에서 '복잡한 생성자'를 대신하여 '단계적으로' 객체를 생성할 수 있는 디자인패턴 중 생성 파트 관련. GoF(Gang of Four) 디자인 패턴 중 하나로 객체 생성 시 가독성과 유연성을 제공하는 것이 목표

- 이상에서의 유연성의 의미는 field를 '순서대로' 채워지지 않아도 되고, 순서를 바꾸더라도 정확한 field에 원하는 값을 집어넣을 수 있다는 것을 의미합니다.

## 특징
1. 객체를 생성하는 여러 개의 field를 '명시적'으로 관리할 수 있음
2. 불필요한 생성자 오버로딩을 줄여 가독성을 높임.
3. 체이닝 메서드를 사용하여 객체를 직관적으로 생성