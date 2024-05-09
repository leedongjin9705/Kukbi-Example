package chap15.sec06.exam01;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // 스택 컬렉션 생성 (LIFO: 마지막에 추가된 것이 먼저 나오는 구조)
        Stack<Coin> coinBox = new Stack<>();

        // 동전을 스택에 추가 (push() 메소드 사용)
        coinBox.push(new Coin(100)); 
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 동전을 하나씩 꺼내기 (pop() 메소드 사용)
        while (!coinBox.isEmpty()) { // 스택이 비어있지 않을 때까지 반복
            Coin coin = coinBox.pop(); // pop()은 스택에서 객체 하나를 꺼내옵니다
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }
    }
}