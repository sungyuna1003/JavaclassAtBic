package ch04;

public class Ex6 {

	public static void main(String[] args) {
/*1~20���� �����߿��� 3,6,9 ������ ���ڴ� ¦���� ǥ���Ͻÿ�.
 * 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 13 ¦... 20
 * Hint: %�̿�
 **/
	for (int i = 1; i < 21; i++) {
		int j = i%10;
	if(j==3||j==6||j==9) {
		System.out.println("¦  ");
	}else {
		System.out.println(i+"  ");
	  }
	}
	}}
	
