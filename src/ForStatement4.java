import java.util.Scanner;

/* (�������)
 * ���丮�� ����ϱ�
 *  (����) n!=1*2*3*.....*n 
 */
public class ForStatement4 {
	public static void main(String[] args) {
		long fact=1;
		//���丮�� ���� �������� ���� Ŀ�� �� ����.
		//�ݵ�� 1�� �ʱ�ȭ�ؾ� ��.
		int num;
		
		System.out.printf("���丮���� ����ϱ� ���� ������ �Է��Ͻÿ�: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
			fact=fact*i;
		
		System.out.printf("%d!�� %d�Դϴ�.\n", num,fact);
		
	}
}
