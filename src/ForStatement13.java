import java.util.Scanner;

/*
 * �Էµ� ���ڸ� �Ųٷ� ����ϱ�
 * - for�� �̿��ؼ�.
 */
public class ForStatement13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		int str_count;
		int i;
		
		System.out.printf("���ڸ� �Է��ϼ��� : ");
		str=scan.nextLine();
		
		System.out.println();
		System.out.printf("�Է��� ���ڿ� ==> %s\n", str);
		System.out.printf("��ȯ�� ���ڿ� ==> ");
		
		str_count=str.length();
		
		for(i=str_count-1;i>=0;i--){
			System.out.printf("%c", str.charAt(i));
		}
	}
}
