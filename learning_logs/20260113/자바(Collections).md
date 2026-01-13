# Collections
- 여러 객체들을 모아둔 것들을 의미함 → 배열과는 약간 차이가 있습니다.
- 다만 Java에서의 List는 python에서는 List와도 차이가 있습니다.
```java
List<Person> List1 = new ArrayList<>();
```
## 종류
1. List : 순서가 있는 데이터의 집합으로, 중복된 요소를 허락함.
    - ArrayLisy : 배열 기반의 리스트, element 접근속도가 빠름
    - LinkedList : 연결 리스트, 삽입 / 삭제 속도가 빠름
2. Set : 중복을 허용하지 않는(List와의 차이 # 1) 데이터들의 집합(중 1 때 배우는 그 집합)
    - HashSet : 해시 테이블 기반의 집합. element의 순서를 보장하지 않음(List와의 차이 # 2)
    - TreeSet : 이진(binaty) 검색 트리 기반의 집합. element가 정렬된 상태로 유지됨.
3. MAp : Key / Value 쌍으로 이루어진 데이터들의 집합.
    - HashMap: 해시 테이블 기반의 맵. 키의 순서를 보장 x
    - TreeMap : 이진 검색 트리 기반의 맵. 키가 정렬된 상태로 유지. 

###  참조 : JavaScript에서의 객체 정의 방식
```js
const person1 = {
    name : "김일",
    age : 20
};
```
- Java에서의 Map과 유사한 형태를 가집니다(추후 수업 예정)
- 근데 JavaScript에서의 객체의 key-value 쌍을 property라고 부릅니다.
- 근데 Java에서의 Map의 key_value 쌍을 또 entry라고 부릅니다.
- 그러면 이 부분 이해했다고 치고 Java는 객체에서 field와 field의 value라고 볼 수 있겠네요.
- 근데 JS에서는 property의 key-value라고 봐야하네요.
- 근데 또 python에서는 arrtibute의 value입니다.
