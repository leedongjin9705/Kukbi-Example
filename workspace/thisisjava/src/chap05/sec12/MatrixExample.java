package chap05.sec12;

public class MatrixExample {

	public static void main(String[] args) {
	       int[][] array = {
	                {95, 86},
	                {83, 92, 96},
	                {78, 83, 93, 87, 88}
	        };

	        int total = 0;
	        int count = 0;

	        // 배열의 각 요소에 접근하여 합을 구함
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                total += array[i][j];
	                count++; // 요소의 개수를 세어서 평균을 구할 때 사용
	            }
	        }

	        // 전체 합과 평균 계산
	        double average = (double) total / count;

	        // 결과 출력
	        System.out.println("전체 합: " + total);
	        System.out.println("전체 평균: " + average);
	    }
	}

