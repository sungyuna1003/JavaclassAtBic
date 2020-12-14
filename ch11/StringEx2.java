package ch11;

public class StringEx2 {
	public static void main(String[] args) {
	//String 은 문자열을 가공하기 위한 기능을 객체화 시킨 클래스
     String s1 = "Java Programming";
   //sun제공 중에 메소드: to~로 시작하면 ~~로 변환
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
     //charAt을 이용하여 s1에 사용된 a 문자의 횟수는?
     int cnt =0;
     for (int i = 0; i < s1.length(); i++) {
    	 char c2 = s1.charAt(1);
    	 if(c2=='a') cnt++;
     }
     System.out.println("/ncnt :"+cnt); //\n새로운 라인 특수문자
     String s4 = "무궁화 꽃이 피었습니다.";
     //charAt을 이용하여 공백 문자에 '_' 를 출력하시오.
     //ex)String s3 = "무궁화_꽃이_피었습니다.";
     for (int i = 0; i < s1.length(); i++) {
    	 char c2 = s1.charAt(1);
    	 if(c2==' ') System.out.println('_');
    	 else System.out.println(c2);
     }
     //s1에 g는 몇번째 자리?
     System.out.println(s1.indexOf('g'));
     //s1 에g는 앞에서 몇번째 자리?
     System.out.println(s1.lastIndexOf('g'));
	}
}
