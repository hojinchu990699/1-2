/*
 * (�������)
 * ������� ������ �ۼ��Ͻÿ�.
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
		
		System.out.printf("1~100�� �տ��� ���ʷ� 1000�� "
				+ "�Ѵ� ��ġ��? : %d\n", i);
		
/*		sum=0;
		for(i=1;i<=44;i++)
			sum+=i;
		System.out.println(sum);*/
	}
}
