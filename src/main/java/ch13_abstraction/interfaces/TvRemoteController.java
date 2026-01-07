package ch13_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }
    //전원 on / off
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    // 채널 다운
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    // 채널 업
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();
    }
    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }

    // 볼륨 다운
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // 볼륨 업
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public String onUpVolumeUpButton() {
        return volumeUpButton.onUp();
    }
}
