import java.util.Scanner;

//����ڰ� �Է��� ������ ������ ���

public class ForStatement5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int dan;
		
		System.out.printf("�� �� ? ");
		dan=scan.nextInt();
		
		for(i=1;i<=9;i++)
		//for(i=9;i>=1;i--)		//(�� �κи� �������)
			System.out.printf("%d * %d = %d \n", dan,i,dan*i);
		
	}
}
