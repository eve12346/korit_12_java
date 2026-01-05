package ch11_arrays;
/*
    향상된 for문(enhanced for loop)

    일반 for 문과의 차이점 :
        일반 for 문의 경우 index 넘버(주소지)를 명확하게 알고 있어야 하지만
        일일이 element의 숫자를 세는 것이 번거롭기 때문에
        arr01.length와 같은 일종의 field 참조를 통해 int 값을 추출하여 대입해야만 했습니다.

        그런데 잘 생각해보면 for ( int i = 0 ; ...) 부분에서 int i는
        for문 내부에서만 선언되고, 내부에서만 사용이 가능합니다.

        이를 응용하여 배열 내의 element에 for 문 내부에서 만 사용하는 변수에
        대입하는 방식을 사용하여 index 넘버의 사용 없이 적용할 수 있는 for
        반복문이 있는데, 이를 향상된 for문이라고 합니다.

    제약 :
        읽기만 되고, 쓰기가 안됩니다.
    형식 :
    for( 자료형 변수명 : 반복가능객체(배열)) {
        반복실행문
    }
 */
public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        // 1부터 200까지 숫자 대입하시오.
        // 일반 for문으로 1 2 3 4 5 ... 200으로 출력하시오.
        for ( int i = 0 ; i < nums.length ; i ++) {
            nums[i] = i+1;
            System.out.println(nums[i] + " ");
        }
        System.out.println();
        // 향상된 for문을 출력하시오.
        // for ( 자료형 변수명 : 변수명 ) {반복실행문}
        for (int number : nums ) {
            System.out.println(number + " ");
        }
        System.out.println();
        //System.out.println(number); // 오류발생
        /*
        String 배열에 김일, 김이, 김삼, 김사, 김오 라는 element를 가지도록 초기화를 하고 (배열명 name)
        일반 for문으로 김일 / 김이 / 김삼 / 김사/ 김오 / 로 출력
        향상된 for문으로 김일 / 김이 / 김삼 / 김사 / 김오 / 로 출력
         */

        // 일반 for문
        String[] names = {"김일" , "김이", "김삼" , "김사", "김오"};
            for ( int i = 0; i < names.length ; i++) {
                System.out.print(names[i] + " / ");
            }
        System.out.println();

        // 향상된 for문
        for ( String name : names) {
            System.out.print(name + " / ");
        }
        System.out.println();
    }
}
