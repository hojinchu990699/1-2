//중첩 for문

public class ForStatement6 {
	public static void main(String[] args) {
		int i,k;
		
		for(i=0;i<1;i++){  //i<1부분을 2, 3으로 변경해보며 결과 함께 확인.
			for(k=0;k<2;k++){
				System.out.printf("중첩 for문입니다. (i값: %d, k값: %d)\n", 
						i,k);
			}
		}
	}
}
