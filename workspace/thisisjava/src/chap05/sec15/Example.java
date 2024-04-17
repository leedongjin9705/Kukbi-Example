package chap05.sec15;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int numberOfStudents = 0;
        int[] scores = null;

        while (running) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");
            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.print("학생수를 입력하세요: ");
                numberOfStudents = scanner.nextInt();
                scores = new int[numberOfStudents];
                scanner.nextLine(); // 버퍼 비우기
            } else if (strNum.equals("2")) {
                if (scores == null) {
                    System.out.println("학생수를 먼저 입력하세요.");
                } else {
                    for (int i = 0; i < numberOfStudents; i++) {
                        System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요: ");
                        scores[i] = scanner.nextInt();
                    }
                    scanner.nextLine(); // 버퍼 비우기
                }
            } else if (strNum.equals("3")) {
                if (scores == null) {
                    System.out.println("학생수를 먼저 입력하세요.");
                } else {
                    System.out.println("점수리스트");
                    for (int i = 0; i < numberOfStudents; i++) {
                        System.out.println("학생 " + (i + 1) + ": " + scores[i]);
                    }
                }
            } else if (strNum.equals("4")) {
                if (scores == null) {
                    System.out.println("학생수를 먼저 입력하세요.");
                } else {
                    int sum = 0;
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    for (int score : scores) {
                        sum += score;
                        max = Math.max(max, score);
                        min = Math.min(min, score);
                    }
                    double average = (double) sum / numberOfStudents;
                    System.out.println("최고 점수: " + max);
                    System.out.println("최저 점수: " + min);
                    System.out.println("평균 점수: " + average);
                }
            } else if (strNum.equals("5")) {
                System.out.println("프로그램을 종료합니다.");
                running = false;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        scanner.close();
    }
}