/*
 * (�������)
 * for��, if�� ����� => 0~127�� �ƽ�Ű�ڵ���
 * 10����,16����,���ڸ� ����ϴ� ���α׷� �ۼ�.
 *  - 16���� ���� �������� ���� �ۼ��Ͻÿ�. 
 */
public class ForStatement12 {
	public static void main(String[] args) {
		int i;
		
		for(i=0;i<128;i++){
			if(i%16==0){
				System.out.printf("-----------------------\n");
				System.out.printf("10����	 16����  ����\n");
				System.out.printf("-----------------------\n");
			}
			System.out.printf("%5d %5x %5c\n", i,i,i);
		}
	}
}
