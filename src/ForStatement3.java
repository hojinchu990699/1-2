import java.util.Scanner;

//1부터 입력한 수까지의 합계를 구하는 프로그램 작성(퀴즈로함)

public class ForStatement3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int i;
		int num;
		
		System.out.printf("값 입력 : ");
		num=scanner.nextInt();
		
		for(i=0;i<=num;i++){
			sum+=i; //sum=sum+1;
		}
		
		System.out.printf("1에서 %d까지의 합: %d \n", num,sum);
	}
}
