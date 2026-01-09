package ch16_bean;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter // 여기가 클래스 레벨
public class UserEntityLombok {
    private int username;
    @Setter // 여기가 필드 레벨에 해당합니다.
    private int password;
    @NonNull
    private String email;
    private String name;

    public UserEntityLombok(int i, String number, String email, String name) {
    }
}
