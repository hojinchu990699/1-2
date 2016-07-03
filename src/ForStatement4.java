import java.util.Scanner;

/* (퀴즈로함)
 * 팩토리얼 계산하기
 *  (정의) n!=1*2*3*.....*n 
 */
public class ForStatement4 {
	public static void main(String[] args) {
		long fact=1;
		//팩토리얼 값은 생각보다 아주 커질 수 있음.
		//반드시 1로 초기화해야 함.
		int num;
		
		System.out.printf("팩토리얼을 계산하기 위한 정수를 입력하시요: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
			fact=fact*i;
		
		System.out.printf("%d!은 %d입니다.\n", num,fact);
		
	}
}
