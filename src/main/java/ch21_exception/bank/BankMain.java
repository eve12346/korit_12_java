package ch21_exception.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    private int balance = 10000;        // 이렇게 쓰면 getter 써서 불러와서 따져야하네요

    public void withdraw(int amount) throws InsufficientBalanceException{
        if (amount > balance) {
            int gap = amount - balance;
            throw new InsufficientBalanceException("잔액이 부족합니다. (부족 금액 : " + gap + " 원)");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankMain bank = new BankMain();
        try {
            System.out.println("현재 잔액 : " + bank.balance + "원");    // BankMain이 같은 클래스니까 getter가 없어도 되네요.
            System.out.print("출금할 금액 입력 >>> ");
            int money = scanner.nextInt();
            bank.withdraw(money);
            bank.balance = bank.balance - money;
            System.out.println("출금 후 잔액 : " + (bank.balance) + " 원");
        } catch (InsufficientBalanceException e) {
            System.out.println("출금 실패 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력이 가능합니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }

        System.out.println(bank.balance);
    }
}
