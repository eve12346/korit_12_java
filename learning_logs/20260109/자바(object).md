# Object 클래스
- _모든 클래스는 Object 클래스를 상속_ 받는다. 그래서 interface를 implements 할 때나 다른 서브 클래스를 만들어서 extends 입력했다고 했을 때 우리가 직접 만들었떤 슈퍼 클래스 이외에 alt + ins 눌러보면 toString() 어쩌고 한 메서드들이 추가되어있었습니다.

1. toString() : 기본적으로 모든 클래스는 Object 클래스를 상속 받아서 클래스 이름과 해시코드(일종의 주소지 개념)를 return함.
    - 이를 Override하여 재정의하고 클래스의 정보를 출력할 때 사용함.
    - field를 정의하고, toString() 메서드를 override해서 필요한 field들을 출력함(name만 혹은 address만도 가능합니다). → 추가적으로 객체의 이름만으로 출력이 가능하기 때문에 `System.out.println(객체명.toString())`이 아니라,`System.out.println(객체명)`로 할 수 있습니다.
2. equals() : String에서의 두 객체가 '논리적으로 같은지'를 비교하는 메서드 (주소지의 차이가 아니라). 기본적으로 Object 클래스의 equals() 메서드는 두 객체의 참조 주소를 비교합니다.
    - 형식 : 객체명1.equals(객체명2) : 객체명1과 객체명2의 참조 주소가 동일한지를 확인함. - 3형식 문장으로 해석하시면 됩니다. SVO
3. hashCode() : 객체를 정수값(해시값)으로 변환(16진수가 아니라). 해시 값은 주로 해시 기반 컬렉션에서 사용됩니다(추후 사용).
    - equals() 메서드를 재정의하게 되면 반드시 hashCode() 메서드도 재정의해야만 합니다. 왜냐면 동일한 객체(equals == true)는 동일한 해시 코드를 가져야하기 때문인데, 문제는 해시코드가 같닥 해서 또 equlas()가 true가 아닌 경우가 있기 때문입니다.
# Lombok
좌측 상단의 메뉴바(햄버거) → 설정(ctrl + alt + s) → 좌측에 plugins(플로그인) 선택 → lombok 검색 → 설치 후 disabled / 비활성화 라고 뜨면 롬복을 설치 후 활성화되었다는 의미입니다.

chrome → mvn 검색 → maven repositories 로 돌아가서 lombok 검색 → 웬만하면 최신 버전 → 그리고 저희가 첫 날에 gradle에 groovy로 만들었었습니다. → 그래서 groovy short 복사한 후에 build.gradle로 가서 annotationProcessor도 빼먹지 말고 이하와 같이 추가해 줍니다.

```java
dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
    implementation 'org.projectlombok:lombok:1.18.42'
    annotationProcessor 'org.projectlombok:lombok:1.18.42'
}
```
그리고 아무 클래스나 들어가서 `@Getter` 등을 입력했을 때 경로가 Lombok으로 나오면 적용이 성공했음을 알 수 있습니다.

## Lambok 주요 annotation
1. @Getter / @Setter
    - class level에 작성할 경우 모든 getter / setter 메서드를 자동 생성
    - field level에 작성할 경우 해당 field에만 메서드 생성
    - 주의 : 객체마다 다른 값을 갖게 되는 비정형 (non_static) field에만 해당됨.
```java
@Setter
@Getter
public class Person {
    private String name;
    private int age;
}
```
2. @ToString
    - toString() 메서드를 자동 생성. 문제는 재정의가 안되고 Lombok라이브러리 default 혀애만 나오기 때문에 원하는 부분만 보여주기 위해서는 override 할 필요가 있습니다.
3. @EqualAndHashCode
    - equals() / hashCode() 메서드를 자동 생성. 객체의 동일성 비교로직을 구현할 때 사용.
        - 아까 학습한 것처럼 equals()를 재정의하면 hashCode()도 반드시 재정의해야하기 때문에 롬복에서는 세트로 묶어놨습니다.
4. @NoArgsConstructor / @RequiredArgsConstructor / @AllargsConstructor
    - @NoArgsConstructor : 매개변수가 없는 기본 생성자를 생성
    - @RequiredArgsConstructor : final 또는 `@NonNull` 애너테이션이 붙은 field만 필수적으로 요구하는 매개변수 생성자를 생성
    - @AllArgsConstructor : 모든 field를 argument로 요구하는 매개변수 생성자

4. @Data
    - @Getter / @Setter / @ToString / @EqualsAndHashCode / @RequiredArgsConstructor가 다 들어가있는 종합 패키지 애너테이션.

5. @Builder - 추후 수업 예정