package ch04;

public class Ex13 {
	public static void main(String[] args) {
		// break: �ݺ������� �߰��� �ݺ��� ����Ǵ� ��� �����
		// ����. 1~100������ ���� ���Ͻÿ�.���� ���� 200������ ������ ���弼��.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (sum > 200) {
			sum -= i; // 200�� �ѱ����� ������ i ���� ����.
			System.out.println(i - 1);
			break;
		}
		sum += i;
	}
	System.out.println("sum : "+sum);
	///////////////////////////////////
	for(int i = 0; i<3; i++) {
    for(int j = 0; j<2; j++) {
   if(i+j>3) {break;} // for2�� ��������.
   System.out.println(i+j);
   }// for2
   System.out.println("----------");
   } // for1
		/////////////////////////////////
	ns: // ns �����ǽ���
	for(int i = 0;i<3;i++){
		for (int j = 0; j < 2; j++) {
			if (i + j > 3) {break ns;}
			} // ��ü �ݺ����� ��������.
		}
	}
}