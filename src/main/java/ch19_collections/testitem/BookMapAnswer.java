package ch19_collections.testitem;

import java.util.*;

public class BookMapAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();

        bookInventory.put("Java프로그래밍 입문", 2);
        boolean endOfProgram = false;
        String bookTitle = "";

        while (!endOfProgram) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서추가\n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.println("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine(); // netxInt()썼으니까 배리어 필요
            switch (option) {
                case 1:
                    System.out.println("새 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    // 근데 기존에 있는 채깅ㄴ지 고려해야합니다.
                    if (bookInventory.containsKey(bookTitle)) {  // 이게 true라면 이미 있는 책
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else { // 일치하는 책이 없을 때 실행되는 조건문
                        System.out.println("재고 수량을 입력하세요 >>> ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        bookInventory.put(bookTitle, stock);
                        System.out.println(bookTitle = " 도서가 " + stock + " 권 추가되었습니다.");
                    }
                    break;
                case 2:
                    System.out.println("수량을 변경할 도서명을 입력하세요 >>> ");
                    bookTitle = scanner.nextLine();
                    if (bookInventory.containsKey(bookTitle)) {
                        // 기존 guide 풀이 방법
//                        System.out.println("\n이미 재고에 있는 도서입니다.");
//                        int stock = scanner.nextInt();
//                        scanner.nextLine();
//                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");
//                        bookInventory.replace(bookTitle, stock);

                        // 그냥 추가분을 입력하면 기존 것에서 더하는 로직을 생각해봅시다.
                        System.out.println("재고 변경분을 입력하세요 >>>");
                        int temp = scanner.nextInt();   // 어차피 얘는 완료 분량이 아니니 임시
                        int stock = bookInventory.get(bookTitle) + temp;
                        System.out.println(bookTitle + " 도서가 " + stock + " 권 으로 변경되었습니다.");
                        bookInventory.put(bookTitle, stock);
                        // 이상의 코드에서의 추가 수정 사항 : 책이 팔리면 내가 -1 로 입력해야 함.
                    } else {
                        System.out.println("해당 도서가 재고에 없습니다");
                    }
                    break;
                case 3:
                    Set<String> bookTitleSet = bookInventory.keySet();  // 책 제목들만 모아서 Set으로 만들었습니다.
                    List<String> bookTitles = new ArrayList<>();        // 근데 Set은 .get()이 안되니까 list 선언하고
                    bookTitles.addAll(bookTitleSet);                    // set의 element들을 List로 옮겼씁니다
                    for ( String book : bookTitles) {
                        System.out.println("도서명" + book + ", 현재 재고 : " + bookInventory.get(book));
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료 합니다");
                    endOfProgram = true;    // case의 break;는 switch 문만 빠져나오고 while문을 빠져나오지 않기 때문에
                    break;                  // 67,68 번 라인이 두 ㄹ다 있어야 합니다.
                default:
                    System.out.println("잘못된 입력 입니다.");
            }
        }
    }
}

