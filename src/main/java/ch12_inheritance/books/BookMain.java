package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book("자바의 정석", "남궁성");
        book1.showInfo();
        System.out.println();

        EBook eBook1 = new EBook("스프링 입문", "이강준",5.2 , "EPUB");
        eBook1.setFormat("PDF");

        System.out.println("이 전자책의 포멧은 " + eBook1.getFormat() + "입니다");

        eBook1.showInfo();
    }
}
