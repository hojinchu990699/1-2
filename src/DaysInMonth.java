import java.util.Scanner;

/*
 * (퀴즈로함)
 * 월의 일수 출력하기 
 *  - switch 이용
 *  - 2월은 윤년 미고려함.
 */
public class DaysInMonth {
	public static void main(String[] args) {
		int month;
		int days=0;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오:");
		Scanner scan=new Scanner(System.in);
		
		month=scan.nextInt();
		switch(month){
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			days=28;
			break;
		default:
			days=31;
			break;
		}
		System.out.printf("%d월의 날수는 %d일 입니다.",month,days);
	}
}
