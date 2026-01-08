package ch13_abstraction.interfaces;
/*
    PowerButton 포함시킬 것
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChangeButton -> 버튼 한 번 누를 때 마다 모드가 변환되어야겠네요
        냉방 <-> 난방
        : Press 버튼을 활용하여 한 번 누르면 그 다음 모드로 이동해야 함.
        (PowerButton의 로직을 활용하여 메서드 작성하시면 됩니다)

    AllArgsConstructor를 정의하고,

    실행 예
    에어컨 리모컨 객체가 생성되었습니다
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다
    온도를 계속 올립니다
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(PowerButton powerButton,
                                    TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton,
                                    ModeChangeButton modeChangeButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.modeChangeButton = modeChangeButton;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    // 전원 on

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
    // 온도 다운
    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }
    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }
    // 온도 업
    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }
    public String onUpTemperatureUpButton() {
        return temperatureUpButton.onUp();
    }
    // 모드 전환
    public void onPressedModeChangeButton() {
        modeChangeButton.onPressed();
    }
}
