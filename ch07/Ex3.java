package ch07;

public class Ex3 {

	public static void main(String[] args) {
//������ �迭 : n�� ���ȣ�� ���� 
//�迭 �ȿ� �迭
 		int arr1[][] = new int [3][2];
 		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j]=i+j;
				System.out.println("arr1["+i+"]["+j+"]: "+arr1[i][j]);
			}
		}
 		//arr2�� ��Ұ��� ���� ���Ͻÿ�.
 		int arr2[][] = {{1,2},
 				                 {3,4,5},
 				                 {6}
 		                             };
 		int sum = 0;
 		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum+=arr2[i][j];
			}
		}
 		System.out.println("sum:"+sum);
 		
 		int arr3[][][] = { {{1,2},{3,4,5}},
 				                  {{6},{7,8,9},{10}},
 				                  {{11,12},{13},{14},{15,16,17,18}}
 		                          };
 		sum = 0;
 		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				for (int j2 = 0; j2 < arr3[i][j].length; j2++) {
					sum+=arr3[i][j][j2];
				}
			}
		}
			
	
 		System.out.println("sum:"+sum);
	}
}
