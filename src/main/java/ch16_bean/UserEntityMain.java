package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("곽민성");

        System.out.println(user1);

        UserEntityLombok user2 = new UserEntityLombok("b@test.com");
        UserEntityLombok user3 = new UserEntityLombok();
        System.out.println(user2.getEmail());
        user2.setPassword(2345);
        System.out.println(user2);
        System.out.println(user3);
        UserEntityLombok user4 = new UserEntityLombok(4, "3456", "d@test.com", "김사");
    }



}
