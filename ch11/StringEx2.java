package ch11;

public class StringEx2 {
	public static void main(String[] args) {
	//String �� ���ڿ��� �����ϱ� ���� ����� ��üȭ ��Ų Ŭ����
     String s1 = "Java Programming";
   //sun���� �߿� �޼ҵ�: to~�� �����ϸ� ~~�� ��ȯ
     String s2 = s1.toUpperCase();
     String s3 = s1.toLowerCase();
     System.out.println(s2+ ":"+s3);
     
     int len = s1.length();
     System.out.println(len);
     char c1 = s1.charAt(1);
     System.out.println(c1);
     for (int i = 0; i < s1.length(); i++) {
    	 System.out.println(s1.charAt(i));
	}
     //charAt�� �̿��Ͽ� s1�� ���� a ������ Ƚ����?
     int cnt =0;
     for (int i = 0; i < s1.length(); i++) {
    	 char c2 = s1.charAt(1);
    	 if(c2=='a') cnt++;
     }
     System.out.println("/ncnt :"+cnt); //\n���ο� ���� Ư������
     String s4 = "����ȭ ���� �Ǿ����ϴ�.";
     //charAt�� �̿��Ͽ� ���� ���ڿ� '_' �� ����Ͻÿ�.
     //ex)String s3 = "����ȭ_����_�Ǿ����ϴ�.";
     for (int i = 0; i < s1.length(); i++) {
    	 char c2 = s1.charAt(1);
    	 if(c2==' ') System.out.println('_');
    	 else System.out.println(c2);
     }
     //s1�� g�� ���° �ڸ�?
     System.out.println(s1.indexOf('g'));
     //s1 ��g�� �տ��� ���° �ڸ�?
     System.out.println(s1.lastIndexOf('g'));
	}
}
