import java.util.Scanner;

/*
 * (�������)-ForStatement12,ForStatement13 ����.
 *  �Է��� ���ڿ��� ���� ���� ���α׷�.
 *   - �빮��,�ҹ���,���ڰ� ���� �� ������ ���� ���α׷� �ۼ�.
 *   - Ư�� ��ȣ �� ���ڴ� ������.
 */
public class DoWhileStatement2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		char ch;
		int upperCount=0, lowerCount=0, digitalCount=0;
		int i;
		
		System.out.printf("���ڿ� �Է�:");
			str=scan.nextLine();			
			i=0;
			do{
				ch=str.charAt(i);
				
				if(ch>='A' && ch<='Z')
					upperCount++;
				if(ch>='a'&& ch<='z')
					lowerCount++;
				if(ch>='0' && ch<='9')
					digitalCount++;
				
				i++;
			}while(i<str.length());
			
			System.out.printf("�빮�� %d��, �ҹ��� %d��, ���� %d��\n",
					upperCount,lowerCount,digitalCount);
		}
}






