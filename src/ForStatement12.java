/*
 * (퀴즈로함)
 * for문, if문 사용해 => 0~127번 아스키코드의
 * 10진수,16진수,문자를 출력하는 프로그램 작성.
 *  - 16개씩 끊어 제목줄이 들어가게 작성하시오. 
 */
public class ForStatement12 {
	public static void main(String[] args) {
		int i;
		
		for(i=0;i<128;i++){
			if(i%16==0){
				System.out.printf("-----------------------\n");
				System.out.printf("10진수	 16진수  문자\n");
				System.out.printf("-----------------------\n");
			}
			System.out.printf("%5d %5x %5c\n", i,i,i);
		}
	}
}
