import java.util.Scanner;

/*
 * (퀴즈로함)-ForStatement12,ForStatement13 참고.
 *  입력한 문자열의 종류 구분 프로그램.
 *   - 대문자,소문자,숫자가 각각 몇 개인지 세는 프로그램 작성.
 *   - 특수 기호 등 문자는 무시함.
 */
public class DoWhileStatement2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		char ch;
		int upperCount=0, lowerCount=0, digitalCount=0;
		int i;
		
		System.out.printf("문자열 입력:");
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
			
			System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개\n",
					upperCount,lowerCount,digitalCount);
		}
}






