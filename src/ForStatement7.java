//�������� �� �� : 2,3,4,....9 => 1ȸ�� ����
//���ڸ� : 1~9�� �ݺ���.
public class ForStatement7 {
	public static void main(String[] args) {
		int i,k;
		
		for(i=2;i<=9;i++){	//2~9���� �ݺ���.
			//System.out.println("## �� "+i+" �� ##"); //(�� �κи� �������)
			for(k=1;k<=9;k++){	//�� �� ���ڸ� ���� 1~9�� �ݺ���.
				System.out.printf("%d * %d = %d \n", 
						i,k,i*k);	//������ ���
			}
			System.out.printf("\n"); //�� �� ������ �� �� ���.
		}
	}
}
