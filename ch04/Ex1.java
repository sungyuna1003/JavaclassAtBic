package ch04;

/*���: ���ù�(���ǹ�) + �ݺ���
 * ���ǹ�: if=else, switch
 * �ݺ��� : while, for
 * ��� ���Ǵ� ����� : continue, break 
 * continue, break : while ��� ����, break : switch ��� ����
 */
public class Ex1 {
	public static void main(String[] args) {
		int a = 10;
		if (a > 0) {
			System.out.println("a�� ����Դϴ�");
		} // if
		if (a > 0) // if ���� ���๮�� 1���̸� �߰�ȣ ���� ����.
			System.out.println("a�� ����Դϴ�");
		if (a > 20)
			System.out.println("�߰�ȣ �׽�Ʈ1");
		    System.out.println("�߰�ȣ �׽�Ʈ2");
		    
	}
}
