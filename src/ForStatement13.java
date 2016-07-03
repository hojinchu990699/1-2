import java.util.Scanner;

/*
 * 입력된 문자를 거꾸로 출력하기
 * - for문 이용해서.
 */
public class ForStatement13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		int str_count;
		int i;
		
		System.out.printf("글자를 입력하세요 : ");
		str=scan.nextLine();
		
		System.out.println();
		System.out.printf("입력한 문자열 ==> %s\n", str);
		System.out.printf("변환된 문자열 ==> ");
		
		str_count=str.length();
		
		for(i=str_count-1;i>=0;i--){
			System.out.printf("%c", str.charAt(i));
		}
	}
}
