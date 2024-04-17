package chap05.sec07;

public class MultidimensionalArrayByNewExample {

    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }
        System.out.println();
        // 전체 학생의 평균 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for(int i=0; i < mathScores.length; i++) {
        	totalStudent += mathScores[i].length; //반의 학생수 합산
        	for(int k=0; k<mathScores[i].length; k++) { // 행의 학생 수만큼 반복
        		totalMathSum += mathScores[i][k]; // 학생 점수 합산
        	}
        }
       double totalMathAvg = (double) totalMathSum / totalStudent;
       System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
       System.out.println();
       // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
       int[][] englishScores = new int[2][];
       englishScores[0] = new int[2];
       englishScores[1] = new int[3];
       for (int i = 0; i < englishScores.length; i++) { // 반의 수만큼 반복
           for (int k = 0; k < englishScores[i].length; k++) { // 해당 행의 수만큼 반복
               System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
           }
       }
       System.out.println();
       //배열 항목 값 변경
       englishScores[0][0] = 90;
       englishScores[0][1] = 91;
       englishScores[1][0] = 92;
       englishScores[1][1] = 93;
       englishScores[1][2] = 94;
       for (int i = 0; i < englishScores.length; i++) { // 반의 수만큼 반복
           for (int k = 0; k < englishScores[i].length; k++) { // 해당 행의 수만큼 반복
               System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
           }
       }
       //전체학생의 영어 평균 구하기
       totalStudent =0;
       int totalEnglishSum = 0;
       for (int i = 0; i < englishScores.length; i++) { // 행의 수만큼 반복
    	   totalStudent += englishScores[i].length; // 학생 수 합산
           for (int k = 0; k < englishScores[i].length; k++) { // 해당 행의 수만큼 반복
        	   totalEnglishSum += englishScores[i][k];
           }
       }
       double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
       System.out.println("전체 학생의 영어 점수 평균 점수: " + totalEnglishAvg);
    }

}