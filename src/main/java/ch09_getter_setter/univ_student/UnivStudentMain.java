package ch09_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {

        // student1
        UnivStudent univStudent1 = new UnivStudent();
        univStudent1.name = "김일";
        univStudent1.grade = 1;
        univStudent1.score = 3.3;
        System.out.println();

        // student2
        UnivStudent univStudent2 = new UnivStudent();
        univStudent2.setName("김이");
        univStudent2.setGrade(3);
        univStudent2.setScore(-30);
        univStudent2.setScore(4.0);

        // student3
        UnivStudent univStudent3 = new UnivStudent();
        univStudent3.setName("김삼");
        univStudent3.setGrade(5);
        univStudent3.setGrade(2);
        univStudent3.setScore(2.7);

        // student4
        UnivStudent univStudent4 = new UnivStudent();
        univStudent4.setName("김사");
        univStudent4.setGrade(4);
        univStudent4.setScore(3.8);

        // student5
        UnivStudent univStudent5 = new UnivStudent();
        univStudent5.setName("김오");
        univStudent5.setGrade(2);
        univStudent5.setScore(1.0);

        // 출력
        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();
    }
}
