package ch11;

public class WrapperEx2 {
	public static void main(String[] args) {
     char data[] = {'A', 'a','4',' ','#'};
     for (int i = 0; i < data.length; i++) {
		if(Character.isUpperCase(data[i])) //~�̴� �ƴϴ�: is~~~
         System.out.println(data[i]+":�빮��");
		if(Character.isLowerCase(data[i])) 
	         System.out.println(data[i]+":�ҹ���");
		if(Character.isDigit(data[i])) 
	         System.out.println(data[i]+":����");
		if(Character.isWhitespace(data[i])) 
	         System.out.println(data[i]+":���鹮��");
     } //--for
    		 } //--main
} //--class
