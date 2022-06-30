public class ch5_배열_활용_학점계산기 {
	public static void main(String[] args) {
		float sum=0f;
		float avg=0f;
		
		float[] score= {4.5f,4,4,3.5f,3.5f,3.5f}; //실수형은 double이 디폴트 자료형이기에 접미사를 붙혀 형변환을 해야한다.
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		avg=sum/(float)score.length;
		
		System.out.printf("김현근님의 3학년 1학기 평균 학점은 %.2f 입니다.",avg);
	}
}