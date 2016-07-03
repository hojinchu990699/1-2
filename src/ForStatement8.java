/*
 * 일단 세로 방향으로 한 번 출력하면=>다시 위로 돌아가 출력 불가함.
 * 오른쪽 공백 활용=>한눈에 보이는 구구단 !!
 * 발상 전환=>가로 내용 먼저 출력하면 가능함.
 */
public class ForStatement8 {
	public static void main(String[] args) {
		int i,k;
		
		//(이 부분만 퀴즈로함)
/*		for(i=2;i<=9;i++)
			System.out.printf(" #제%d단# ", i);
		System.out.println();
		System.out.printf("\n");*/	
		
		for(i=1;i<=9;i++){	//각 단의 뒷자리 숫자 1~9를 반복함.
			for(k=2;k<=9;k++){	//2~9단을 반복함.
				System.out.printf("%3d*%d=%2d", k,i,k*i); 
				//출력자리수 조정(%3d)
				//\n을 넣지않음: 2*1=2 다음 바로 옆에 3*1=3을 이어서 출력하기 위함.
				//==>각 단별로 한 줄씩 출력(발상 전환)
			}
			System.out.printf("\n");
			//가로줄 하나를 모두 출력한 후 다음 줄로 넘김.
		}
	}
}
