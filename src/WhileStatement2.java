import java.util.Scanner;

/*
 *  2���� ��� ����ǥ��.pdf ����.
 *  �Է��� ���ڸ�ŭ ��ǥ ���
 *  - 0~9 �߿��� �Է��� ���ڸ�ŭ ��ǥ ����ϴ� ���α׷�.
 *    ��)5914
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
		int star;	//���� ���� ����.
		
		System.out.printf("���ڸ� ���� �� �Է� :");
		str=scan.nextLine();
		
		i=0;  //���ڿ��� ��ġ�� ��Ÿ�� ���� i =>ù��° ����.
		ch=str.charAt(i);	
		//���ڿ����� �ѱ���(����) ������(ù ��° ����)
		
		while(true){
			star=(int)ch-48;
			/*
			 * ���ڸ� ���ڷ� ��ȯ��.
			 * ��) (���� 0�� �ƽ�Ű�ڵ� ���� 48��)
			 * 	==> ����5�� �ƽ�Ű�ڵ� ���� 53��.
			 * 	    ����5�� ����5�� �������, 
			 * 	  53-48����� ����ȯ�ϸ� ��.
			 */
			for(k=0;k<star;k++)
				System.out.printf("*");
				//���� ������ŭ *�� ȭ�鿡 �����.
			System.out.println();
			
			if(++i>str.length()-1)
				break;
			/*
			 * ������ ����=>�Է��� ���ڿ��� �������� 
			 * 	���ڿ� ��ġ�� ��Ŭ�� �ݺ���(��ǥǥ��) ����
			 */
			ch=str.charAt(i);
			//���ڿ����� �� ���� �� ����(����)�� ������.
		}
	}
}












