package ch07;

public class Ex1 {

	public static void main(String[] args) {
//		�迭 ����
		int arr1[] = new int[10];
		int[] arr2 = new int[10];
		int arr3[] = new int[] {1,2,3,4,5};
		int arr4[] = {1,2,3,4,5};
		String str1[] = new String[3]; //Ŭ���� Ÿ���� �⺻���� null �̴�.
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
		Ex1 e = new Ex1();
		Ex1 e1 = null; //null:��ü�� ����Ű�� ���� ���� ����
		System.out.println(e.toString()); //������� ��ü�� ������ ���� ���� �żҵ� ȣ��
		System.out.println(e1.toString()); //���� ��ü�� �޼ҵ� ȣ��
		}
	}


