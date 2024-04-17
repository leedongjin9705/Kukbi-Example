package chap06.sec08.exam03;

public class Car {// 라이브러리 클래스
    // 필드 선언
    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경함
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다");
            return false;  // false를 리턴하고 메소드를 종료함
        } else {
            System.out.println("gas가 있습니다");
            return true; // true를 리턴하고 메소드 종료
        }
    }

    // 리턴값이 없는 메소드로 GAS 필드값이 0이면 return문으로 변경함
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("자동차가 달립니다(gas 잔량 : (" + gas + "))");
                gas -= 1;
            } else {
                System.out.println("자동차가 멈춥니다(gas 잔량 : (" + gas + "))");
                return; // 메소드 종료
            }
        }
    }
}