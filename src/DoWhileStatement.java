import java.util.Scanner;

/*
 * (퀴즈로함)
 * do~while문 이용.
 * =>손님이 들어오면 적어도 한번 이상 주문 여부 확인
 */
public class DoWhileStatement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int menu;
		
		do{
			System.out.printf("\n손님 주문하시겠습니까? \n");
			System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬께요 : ");
			menu=scan.nextInt();
			
			switch(menu){
			case 1:
				System.out.printf("#카페라떼 주문하셨습니다.\n");
				break;
			case 2:
				System.out.printf("#카푸치노 주문하셨습니다.\n");
				break;
			case 3:
				System.out.printf("#아메리카노 주문하셨습니다.\n");
				break;
			case 4:
				System.out.printf("주문하신 커피 준비하겠습니다.\n");
				break;
			default:
				System.out.printf("잘못 주문하셨습니다.\n");
			}
		}while(menu!=4);
	}
}
