package ch16_bean;

import lombok.Getter;

/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열         2열       3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
@Getter
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    // 생성자
    public UserEntity() {
    }

    // getter / setter

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "username= " + username +
                "\npassword= " + password +
                "\nemail= " + email +
                "\nname= " + name  +
                "비밀번호는 보안상 제공되지 않슴니다";
    }
}
