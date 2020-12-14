package ch11;

//�����μ�: 
public class WrapperEx4 {

	public static void plus(int a, int b) {
		int sum = a + b;
		System.out.println("sum:" + sum);
	}
	public static void plus(int a, int b, int c) {
		int sum = a + b+c;
		System.out.println("sum:" + sum);
	}
	
	public static void plus(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println("sum:" + sum);
	}
	//�����μ� �޼ҵ�
	public static void vplus(int...arr) /*���������� �迭*/{
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
	}
	
	public static void main(String[] args) {
		plus(22, 23);
		plus (22,23,45);
         int arr1[] = {1,2,3,4,5};
         plus(arr1);
      vplus(1);
      vplus(1,2);
      vplus(1,2,3,4);
      vplus(1,2,3,4,5,6,7,8,9);
/////////////////////////////////////////
      int i = 10, j = 20, k = 30;
      int t = i+j+k;
      System.out.println(i+"+"+j+"+"+k+"="+t);
      System.out.printf("%d + %d + %d = %d", i,j,k,t);
	} // --main
} // --class
