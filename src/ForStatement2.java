//500~1000���� Ȧ���� ��
public class ForStatement2 {
	public static void main(String[] args) {
		int sum=0;
		int i;
		
		for(i=501;i<=1000;i+=2){ //500 or 501 �����ϱ�.
			sum+=i;
		}
		
		System.out.printf("500���� 1000���� Ȧ���� ��: %d \n", sum);
	}
}
