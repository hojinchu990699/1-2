//구구단의 각 단 : 2,3,4,....9 => 1회만 증가
//뒷자리 : 1~9가 반복됨.
public class ForStatement7 {
	public static void main(String[] args) {
		int i,k;
		
		for(i=2;i<=9;i++){	//2~9단을 반복함.
			//System.out.println("## 제 "+i+" 단 ##"); //(이 부분만 퀴즈로함)
			for(k=1;k<=9;k++){	//각 단 뒷자리 숫자 1~9를 반복함.
				System.out.printf("%d * %d = %d \n", 
						i,k,i*k);	//구구단 출력
			}
			System.out.printf("\n"); //각 단 끝나면 한 줄 띄움.
		}
	}
}
