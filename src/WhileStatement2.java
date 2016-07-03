import java.util.Scanner;

/*
 *  2진수 기반 문자표현.pdf 참조.
 *  입력한 숫자만큼 별표 출력
 *  - 0~9 중에서 입력한 숫자만큼 별표 출력하는 프로그램.
 *    예)5914
 *       *****
 *       *********
 *       *
 *       ****
 *       
 */
public class WhileStatement2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		char ch;
		int i,k;
		int star;	//별의 개수 추출.
		
		System.out.printf("숫자를 여러 개 입력 :");
		str=scan.nextLine();
		
		i=0;  //문자열의 위치를 나타낼 변수 i =>첫번째 문자.
		ch=str.charAt(i);	
		//문자열에서 한글자(숫자) 추출함(첫 번째 숫자)
		
		while(true){
			star=(int)ch-48;
			/*
			 * 문자를 숫자로 변환함.
			 * 예) (문자 0의 아스키코드 값이 48임)
			 * 	==> 문자5는 아스키코드 값이 53임.
			 * 	    문자5를 숫자5로 만들려면, 
			 * 	  53-48결과를 형변환하면 됨.
			 */
			for(k=0;k<star;k++)
				System.out.printf("*");
				//별의 개수만큼 *를 화면에 출력함.
			System.out.println();
			
			if(++i>str.length()-1)
				break;
			/*
			 * 끝나는 조건=>입력한 문자열의 개수보다 
			 * 	문자열 위치가 더클때 반복문(별표표시) 종료
			 */
			ch=str.charAt(i);
			//문자열에서 그 다음 한 글자(숫자)를 추출함.
		}
	}
}












