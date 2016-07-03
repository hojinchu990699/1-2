import java.util.Scanner;

/*
 * (퀴즈로함)
 * while문, if문 이용.  
 *  - 입력한 두 수 사이의 합계를 구하되
 *    원하는 배수를 선택하여 합계를 구하는 프로그램 작성.
 *    (캡쳐는 예시임)
 */
public class WhileStatement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int startNum,endNum;
		int multipleNum,i;
		int sum=0;
		
		System.out.printf("합계의 시작값 ==> ");
		startNum=scan.nextInt();
		
		System.out.printf("합계의 끝값 ==> ");
		endNum=scan.nextInt();
		
		System.out.printf("배수(multiple) 입력==> ");
		multipleNum=scan.nextInt();
		
		i=startNum;
		while(i<=endNum){
			if(i%multipleNum ==0){
				System.out.printf("%d \t", i);
				sum+=i;
			}
			i++;
		}
		System.out.println();
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d\n",
				startNum,endNum,multipleNum,sum);
	}
}








