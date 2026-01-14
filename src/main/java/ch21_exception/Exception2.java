package ch21_exception;

import java.lang.Exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message); // 이건 그냥 message를 argument로 한 LoginFailedException의 슈퍼 클래스 생성자를 호출한다는 뜻
        System.out.println("로그인 시 예외가 발생하였습니다.");
    }
}
/*
    Exception(String message) {
        this.message = message;
    }
    인 상태라고 봐야겠네요. 그걸 41 번 라인에서 getter(getMessage())를 통해서 출력했기 때문에 콘솔상의 순서가 다르게 보입니다.
 */

public class Exception2 {

    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r!!";
        // 특정 메서드에서 예외가 발생하는 것을 지정하고 싶다면 throw 명령어를 입력해야 함(3인칭 단수라서)
        if(!id.equals(correctId) || !password.equals(correctPassword)){
            throw new LoginFailedException("ID 또 PW가 틀렸습니다.");
            // throw(s가 없습니다) : 동사 원형으로 시작했으니까 명령문
            // LoginFailedException() 생성자에 String arguement를 집어넣어서 객체를 생성했는데,
            // 그 객체를 던지라는 의미로 해석될 수 있습니다.
        }
    }

    public static void main(String[] args) {
        String inputId = "admib";
        String inputPassword = "1234qwer!!";

//        login(inputId, inputPassword);
        // throws를 달고 나니까 오류가 발생했씁니다 → try / catch / finally 쓰라는 뜻입니다.
        // 혹슨 main도 method에 해당하니까 main 메서드에 throws를 입력해도 됩니다.
        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }












    }
}
