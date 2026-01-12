package ch18_generic;

import ch18_generic.bmi.Person;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장" , now.toString());
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData<>("나이 저장", 26);
        System.out.println(responseData2);

        ResponseData<Double> responseData3 = new ResponseData<>("학점 저장" , 4.0);
        System.out.println(responseData3);

        ResponseData<Person> responseData4 = new ResponseData<>("사람 객체" , new Person("김사", 170, 64));
        System.out.println(responseData4);
    }
}
