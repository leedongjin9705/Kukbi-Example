package chap14.sec07.exam01;

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
        	// stop 필드값에 따라 반복 여부 결정 	
        	// stop = false면 조건식이 true가 되어 계속 반복
        	
            System.out.println("실행중");
        }

        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}