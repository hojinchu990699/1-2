import java.util.Scanner;

/*
 * (�������)
 * �� ���� �� ��� 
 */
public class ForStatement11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		
		for(;;){
			System.out.println("�����ҷ��� 0�� �Է��ϼ���");
			System.out.printf("���� ù ��° �� �Է� : ");
			num1=scan.nextInt();
			
			if(num1==0){
				System.out.println("�����մϴ�.");
				break;				
			}
			
			System.out.printf("���� �� ��° �� �Է� : ");
			num2=scan.nextInt();
			
			System.out.printf("%d + %d = %d \n", 
					num1,num2,num1+num2);
			
		}
		
/*		while(true){
			System.out.println("�����ҷ��� 0�� �Է��ϼ���");
			System.out.printf("���� ù ��° �� �Է� : ");
			num1=scan.nextInt();
			
			if(num1==0){
				System.out.println("�����մϴ�.");
				break;				
			}
			
			System.out.printf("���� �� ��° �� �Է� : ");
			num2=scan.nextInt();
			
			System.out.printf("%d + %d = %d \n", 
					num1,num2,num1+num2);			
		}*/
	}
}
