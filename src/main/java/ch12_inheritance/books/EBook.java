package ch12_inheritance.books;

public class EBook extends Book{
    private double fileSize;
    private String format;

    // 생성자
    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    // getter / setter
    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }



    public void showInfo() {
        System.out.println("제목 : " + getTitle()
                + "\n저자 : " + getAuthor()
                + "\n파일 크기 : " + getFileSize() + " Mb"
                + "\n파일 형식 : " + getFormat() + " (PDF / EPUB)");
    }
}
