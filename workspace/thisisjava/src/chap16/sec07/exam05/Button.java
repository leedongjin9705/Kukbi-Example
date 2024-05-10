package chap16.sec07.exam05;

public class Button {
    
    @FunctionalInterface
    public static interface ClickListener {
        void onClick(); // 수정: 메소드 이름을 onClick으로 변경
    }
    
    private ClickListener clickListener; 
    
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    
    public void click() {
        this.clickListener.onClick(); // 수정: 메소드 이름을 onClick으로 변경
    }
}