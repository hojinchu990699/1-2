import java.util.Scanner;

/*
 * (퀴즈로함)
 * 두 수의 합 출력 
 */
public class ForStatement11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		
		for(;;){
			System.out.println("종료할려면 0을 입력하세요");
			System.out.printf("더할 첫 번째 수 입력 : ");
			num1=scan.nextInt();
			
			if(num1==0){
				System.out.println("종료합니다.");
				break;				
			}
			
			System.out.printf("더할 두 번째 수 입력 : ");
			num2=scan.nextInt();
			
			System.out.printf("%d + %d = %d \n", 
					num1,num2,num1+num2);
			
		}
		
/*		while(true){
			System.out.println("종료할려면 0을 입력하세요");
			System.out.printf("더할 첫 번째 수 입력 : ");
			num1=scan.nextInt();
			
			if(num1==0){
				System.out.println("종료합니다.");
				break;				
			}
			
			System.out.printf("더할 두 번째 수 입력 : ");
			num2=scan.nextInt();
			
			System.out.printf("%d + %d = %d \n", 
					num1,num2,num1+num2);			
		}*/
	}
}
