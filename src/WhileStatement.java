import java.util.Scanner;

/*
 * (�������)
 * while��, if�� �̿�.  
 *  - �Է��� �� �� ������ �հ踦 ���ϵ�
 *    ���ϴ� ����� �����Ͽ� �հ踦 ���ϴ� ���α׷� �ۼ�.
 *    (ĸ�Ĵ� ������)
 */
public class WhileStatement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int startNum,endNum;
		int multipleNum,i;
		int sum=0;
		
		System.out.printf("�հ��� ���۰� ==> ");
		startNum=scan.nextInt();
		
		System.out.printf("�հ��� ���� ==> ");
		endNum=scan.nextInt();
		
		System.out.printf("���(multiple) �Է�==> ");
		multipleNum=scan.nextInt();
		
		i=startNum;
		while(i<=endNum){
			if(i%multipleNum ==0){
				System.out.printf("%d \t", i);
				sum+=i;
			}
			i++;
		}
		System.out.println();
		System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n",
				startNum,endNum,multipleNum,sum);
	}
}








