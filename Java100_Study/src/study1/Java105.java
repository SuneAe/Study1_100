package study1;

public class Java105 {
	//기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오.
		//이 문제는 기본형 타입의 값을 초기화하는 방법에 대해서 알고 있는지를 묻는 문제이다.
		
		public static void main(String[] args) {
			//[1]: 기본형 타입--> 8개 --> 변수 선언과 동시에 값을 입력
			byte b = 127;
			short s = 32767;
			int i = 2147483647;
			long l = 700000000L;
			float f = 9.8F;
			double d = 3.14;
			char c = 'A';
			boolean bl = false;
			
			//[2]: 출력
			System.out.println(b+"byte최대값-->"+Byte.MAX_VALUE);
			System.out.println(s+"shotr최대값-->"+Short.MAX_VALUE);
			System.out.println(i+"int최대값-->"+Integer.MAX_VALUE);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
			System.out.println(c);
			System.out.println(bl);
	//정수형변수를 문자령으로 형(Type)변환시켜서 출력하면 어떤 결과가 나오는지 말해보시오.
	//아래 코드의 결과를 예상하여 말해보시오.
	//이 문제는 정수형과 문자형의 타입 변환시 일어나는 변화에 대해서 알고 있는지를 묻는 문제이다.
		//[1]
			short a = 'A';
			System.out.println(a); //A(65)+(26-1)=Z(90)
			
		//[2]
			short c1 = 90;
			System.out.println((char)c1);  // 대문자 Z를 출력된다.
	    //[3]
			char c2 = 'a';
			System.out.println((short)c2);// 소문자 a는97 출력됨 a(97)+(26-1)=z(122)
			
			
			
			
		}


}
