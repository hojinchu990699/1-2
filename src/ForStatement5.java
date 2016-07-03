import java.util.Scanner;

//사용자가 입력한 숫자의 구구단 출력

public class ForStatement5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int dan;
		
		System.out.printf("몇 단 ? ");
		dan=scan.nextInt();
		
		for(i=1;i<=9;i++)
		//for(i=9;i>=1;i--)		//(이 부분만 퀴즈로함)
			System.out.printf("%d * %d = %d \n", dan,i,dan*i);
		
	}
}
