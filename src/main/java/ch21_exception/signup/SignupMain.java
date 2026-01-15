package ch21_exception.signup;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class SignupMain {
    public static void checkId(String id) throws InvalidIdException {
        if (id.length() < 8 ) {
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력해 주세요 >>> ");
        try {
            String id = scanner.nextLine().replace(" ","");
            checkId(id);
            System.out.println("아이디가가 성공적으로 저장되었습니다. : " + id);
        } catch (InvalidIdException e) {
            System.out.println("오류 : " + e.getMessage());
        }
        finally {
            System.out.println("시스템을 종료 합니다.");
        }
    }
}
