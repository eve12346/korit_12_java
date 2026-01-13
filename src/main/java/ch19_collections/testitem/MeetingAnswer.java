package ch19_collections.testitem;

import java.util.*;

public class MeetingAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String > attendees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();
        boolean endOfName = false;

        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ]를 입력하면 프로그램을 종료합니다.");
        // 이하에서 횟수가 정해지지 않은 반복문을 작성해야 하므로 while 도입
        while (!endOfName) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String name = scanner.nextLine();
            if(name.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            attendees.add(name);
        }
        System.out.println("--- 최종 참석자 명단 ---");
        // set → list 형변환
        meetingList.addAll(attendees);
        for ( int i = 0 ; i < meetingList.size(); i ++) {
            if(i == meetingList.size() - 1) {
                System.out.println(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i) + ", ");
        }

        // 근데 .sort()로 김일 다음에 김이가 나오지 않는다는 점이 문제가 있죠.
        // 원래의 경우에는 이 부분은 DB 단계에서 sorting을 하고 출력합니다.

        int a = 1;
        int b = 2;

        // 근데 a에 2 대입하고, b에 1 대입하는 방법
        int temp = a;
        a = b ;     // 이 시점에 a = 2가 됩니다
        b = temp;   // 그럼 여기서 b = 1이 됩니다
        System.out.println(a);
        System.out.println(b);
    }
}
