# Lambda Expression(람다식)

## 정의
Java 8 도입된 함수형 프로그래밍 스타일을 Java에 적용한 것으로 _메서드를 하나의 식(expression)으로 표현한 것_ 을 의미함.

- 원래는 익명 함수(Anonymous Function)이라고 부릅니다 (저희는 JS에서 더 자세히 다룹니다). 기존의 Java에서는 메서드 하나를 만들기 위해 반드시 클래스를 만들고 객체를 생성해야 하지만 (정적 메서드 제외), 람다식을 사용하면 해당 과정을 다 줄일 수 있습니다.

## 문법 구조
기존 메서드에서 메서드명과 return 타입을 제거하고 `->`를 사용합니다. (근데 JS에서는 `=>`를 씁니다.)
`(매개변수) -> {실행문}`

## 코드 예시
- 예를 들어 두 수 중 더 큰 숫자를 return하는 메서드를 정의한다고 합시다.
1. 기존 코드
```java
Comparator<Integer> comp = new Comparator<>() {
    @Override
    public int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }
}

// 우리가 직접 정의한다고 가정
public class Temp {
    public int returnMax(int a, int b) {
        int result = 0;
        if(a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
```

2. Lambda Expression 적용
```java
Comparator<Integer> comp = (a, b) -> a.compareTo(b);
```

## 람다식을 사용하는 이유(장점)
1. 코드 간결성
    - 불필요한 코드 반복이 사라집니다. 클래스 정의 / 메서드 정의 등을 빼고 표현식에 해당하는 부분만 작성할 수 있음.
2. 컬렉션(Collection) 활용의 극대화
    - 저희는 SpringBoot에서 Security 관련에서 자주 쓰겠지만 원래는 Collection과 관련된 Stream API와 결합했을 때 큰 효과를 가집니다. 배열이나 리스트의 데이터를 필터링하거나 변환할 때 `for / if` 문을 줄일 수 있습니다

예를 들어 List에서 짝수만 출력하는 부분을 예시로 들겠습니다.
```Java
List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10)
List<Integer> evenNums = new ArrayList<>();
        // 짝수만 뽑아서 evenNums에 대입하고, evenNums를 출력하시오.
        // List 내부 element를 뽑기 위한 반복문 → 그 뽑은 element가 짝수인지 확인하는 조건문

        for (Integer num : nums) {
            if (num % 2 == 0 ) evenNums.add(num);
        }
        System.out.println(evenNums);

        nums.stream().filter(n -> n%2==0).forEach(System.out::println); // 람다식
```

3. 병렬 처리의 용이성
    - 람다식을, 사용하면 개발자가 직접 스레드를 관리하지 않아도 Java내에서 데이터를 나누어 여러 CPU에서 동시에(비동기적처리 혹은 병렬처리)하기 쉬운 구조가 됩니다.

## 함수형 인터페이스(제한)
- 람다식 자체는 아무데나 쓸 수 있는 것은 아니고 _딱 하나의 추상 메서드만 가진 인터페이스_ 에서만 사용할 수 있습니다. 이를 `함수형 인터페이스(@FunctionalInterface)`라고 합니다.

## 람다식 뭄법 생략 규칙
- 매개변수 타입 생략 : 인터페이스 내에 자료형이 정의되어 있으므로 생략가능합니다.
`(int a) -> { ... }` -> `(a) -> { ... }`

- 매개변수가 하나라면 괄호가 생략 가능합니다.
`(a) -> { ... }` -> `a -> { ... }`

- 실행문이 한 줄이면 `{}`와 `return` 문구 생략 가능
`a -> { return a * a; }` => `a -> a*a;`

## 자주 사용되는 Stream API
1. Filter
    - 데이터 중에서 특정 조건에 맞는 것만 고르는 역할
        - 특징 : 결과 데이터의 개수가 줄어들 수 있지만, 데이터의 자료형은 변경 x
        - 코드 예시 : `s -> s >= 60` - 점수가 60 점 이상인 것만 통과됨
2. Map
    - 데이터를 다른 값이나 형태로 나누는 역할(Frontend에서도 자주 쓰임)
    - 특징 : 데이터의 개수는 원본과 동일하지만, 데이터의 값이나 자료형이 변경될 수 있음
    - 코드 예시 : `s -> s + 5` 각 scores의 내부 s에 대해 +5를 한 결과값이 도출됨.
3. Sorted
    - 데이터를 특정 기준에 따라서 순서대로 나열하는 역할
    - 특징: 데이터의 내용이나 개수는 변하지 않고 오직 순서만 바뀜.
    - 코드 예시 : `Comparator.reverseOrder()` 내림 차순 정렬에 해당
적용 사례
```java
List<Integer> scores = List.of(23, 1657, 2654, 9403, 59, 68, 1, 5, 67, 4, 3, 56);
        scores.stream()                         // 1. StreamAPI 사용할거다
                .filter(s -> s >= 60)    // 2. 60 점 미만은 빼버릴거다
                .map(s -> s + 5)         // 3. 남아있는 거에 5 점씩 더해줄거다
                .sorted()                       // 4. 오름 차순으로 정렬할거다
                .forEach(System.out::println);  // 5. 각각 출력할거다
```