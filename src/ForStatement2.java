//500~1000까지 홀수의 합
public class ForStatement2 {
	public static void main(String[] args) {
		int sum=0;
		int i;
		
		for(i=501;i<=1000;i+=2){ //500 or 501 질문하기.
			sum+=i;
		}
		
		System.out.printf("500에서 1000까지 홀수의 합: %d \n", sum);
	}
}
