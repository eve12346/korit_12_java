package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {

//        Book book1 = new Book(); - 이제는 이렇게 생성하는 게 불가능 ->AllArgsConstructor

        Book book1 = new Book("자바의 정석", "남궁성");
        book1.showInfo();

        EBook eBook1 = new EBook("스프링 입문", "이강준",5.2 , "EPUB");
        eBook1.setFormat("PDF");        // 자식 클래스의 고유 메서드에 해당
        System.out.println("이 전자책의 포멧은 " + eBook1.getFormat() + "입니다");

        eBook1.showInfo();
    }
}
