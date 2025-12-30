package ch08_classes.Products;

public class ProductMain {
    public static void main(String[] args) {
        // 지시사항 # 1
        System.out.println("지시사항 # 1");
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘페드";
        product1.showInfo();

        // 지시사항 # 2
        System.out.println("지시사항 # 2");
        Product product2 = new Product(987654);
        product2.productName = "다이소 충전기";
        product2.showInfo();

        // 지시사항 # 3
        System.out.println("지시사항 # 3");
        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 159357;
        product3.showInfo();

        // 지시사항 # 4
        System.out.println("지시사항 # 4");
        Product product4 = new Product(951753, "GFlip6");
        product4.showInfo();
    }
}
