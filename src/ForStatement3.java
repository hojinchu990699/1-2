import java.util.Scanner;

//1���� �Է��� �������� �հ踦 ���ϴ� ���α׷� �ۼ�(�������)

public class ForStatement3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int i;
		int num;
		
		System.out.printf("�� �Է� : ");
		num=scanner.nextInt();
		
		for(i=0;i<=num;i++){
			sum+=i; //sum=sum+1;
		}
		
		System.out.printf("1���� %d������ ��: %d \n", num,sum);
	}
}
