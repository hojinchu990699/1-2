/* (퀴즈로함)
 * 여러 개의 초깃값과 증감식을 사용하는 for문
 */
public class ForStatement10 {
	public static void main(String[] args) {
		int i,k;
		
		for(i=1,k=1;i<=9;i++,k++)
			System.out.printf(" %d * %d = %d \n", 
					i,k,i*k);
	}
}
