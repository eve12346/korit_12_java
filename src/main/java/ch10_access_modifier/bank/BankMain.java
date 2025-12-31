package ch10_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        bank1.setBalane(100000);
        bank1.setPinNumber(1234);

        Bank bank2 = new Bank();
        bank2.setAccountNum(987654);
        bank2.setAccountHolder("신사임당");
        bank2.setBalane(500000);
        bank2.setPinNumber(9876);

        bank1.showAccountInfo();
        bank2.showAccountInfo();

        bank1.deposit(-10000,1234);
        bank1.withdraw(2000000,1234);
        bank1.withdraw(100000,1234);

        System.out.println();

        bank2.withdraw(100000,9876);
        bank2.deposit(200000,9876);

        System.out.println("\n최종계좌");
        bank1.showAccountInfo();
        bank2.showAccountInfo();
    }
}
