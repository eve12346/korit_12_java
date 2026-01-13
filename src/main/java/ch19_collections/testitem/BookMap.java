package ch19_collections.testitem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventory = new HashMap<>();

        while (true) {
            System.out.println();
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    String newBook = scanner.nextLine();
                    if (inventory.containsKey(newBook)) {
                        System.out.println("이미 재고에 있는 도서입니다.");
                    } else {
                        System.out.print("재고 수량을 입력하세요 >>> ");
                        int bookPlus = scanner.nextInt();
                        scanner.nextLine();
                        inventory.put(newBook, bookPlus);
                        System.out.println(newBook + " 도서가 " + bookPlus + " 권 추가되었습니다.");
                    }
                    break;

                case 2:
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                    String bookUpdate = scanner.nextLine();
                    if (!inventory.containsKey(bookUpdate)) {
                        System.out.println("해당 도서가 재고에 없습니다.");
                    } else {
                        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                        int newBookPlus = scanner.nextInt();
                        scanner.nextLine();
                        inventory.put(bookUpdate, newBookPlus);
                        System.out.println(bookUpdate + " 도서가 " + newBookPlus + " 권으로 변경되었습니다.");
                    }
                    break;

                case 3:
                    System.out.println("--- 현재 재고 목록 ---");
                    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                        System.out.println("도서명 : " + entry.getKey() + ", 재고 수량 : " + entry.getValue() + " 권");
                    }
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}
