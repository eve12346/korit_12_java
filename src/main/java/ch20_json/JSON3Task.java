package ch20_json;

import com.google.gson.Gson;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;
import java.util.List;

@Data
@AllArgsConstructor

class Book {
    private long bookId;
    private String title;
    private String author;
    private List<String> categories;
}

public class JSON3Task {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Book book1 = new Book(101,"자바 마스터", "안선생", Arrays.asList("프로그래밍, 컴퓨터공학") );
        Book book2 = new Book(102,"파이썬 마스터", "김철수", Arrays.asList("데이터 분석") );

        System.out.println("미션2");
        String jsonData1 = gson.toJson(book1);
        System.out.println(jsonData1);

        System.out.println("미션3");
        Map<String , Object> bookName = gson.fromJson(jsonData1, Map.class);
        System.out.println("도서 제목 : " + bookName.get("title"));

        System.out.println("미션4");
        String bookJson1 = gson.toJson(book1);
        String bookJson2 = gson.toJson(book2);
        System.out.print(bookJson1 + ", " + bookJson2);
    }
}
