/*
 * (퀴즈로함)
 * 결과값이 나오게 작성하시오.
 */
public class ForStatement14 {
	public static void main(String[] args) {
		int sum=0;
		int i;
		
		for(i=1;i<=100;i++){
			sum+=i;	//sum=sm+1;
			
			if(sum>=1000)
				break;
		}
		
		System.out.printf("1~100의 합에서 최초로 1000이 "
				+ "넘는 위치는? : %d\n", i);
		
/*		sum=0;
		for(i=1;i<=44;i++)
			sum+=i;
		System.out.println(sum);*/
	}
}
