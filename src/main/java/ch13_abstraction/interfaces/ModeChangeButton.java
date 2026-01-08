package ch13_abstraction.interfaces;

public class ModeChangeButton extends Button{
    private boolean mod;

    @Override
    public void onPressed() {
        if(mod) {
            mod = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            mod = !mod;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}
