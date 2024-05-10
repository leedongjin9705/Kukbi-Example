package chap16.sec07.exam05;

public class Example {

    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다")); // Ok 버튼 클릭 시 출력되는 메시지 설정
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다")); // Cancel 버튼 클릭 시 출력되는 메시지 설정
        btnCancel.click();
    }

}