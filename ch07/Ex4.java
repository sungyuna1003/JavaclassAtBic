package ch07;

public class Ex4 {
	public static void main(String[] args) {
//�迭 ����
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
		}
		System.out.println("---------------------------------");
		int arr3[] = new int[arr1.length];
		// arraycopy(�����ҹ迭,������ ù��ġ, ���迭,����ù��ġ,����)
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		///////////////////////////////////////
		String str[] = {"īī��","��Ʃ��","�ν�Ÿ","ƽ��","Ʈ����"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("-----------------------------");
		for (String st : str) { //1.5
			System.out.println(st);
		}
	}
}
