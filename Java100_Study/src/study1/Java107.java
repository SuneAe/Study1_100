package study1;

public class Java107 {
	//정수형(int)을 문자열(String)로 변환하여 정수의 자릿수를 구하는 코드를 구현해보세요.
	//정수 12345를 입력하면"자릿수가 "5"로 출력되도록 한다.
	//이 문제는 정수형을 문자열로 문자열로 정수형으로 변환하는 방법에 대해서 아는지를 묻는 문제이다.
	//[!]: 바꾸는 이유?
	//정수형끼리의 연산이 아닌 경우 더하기 연산 등을 수행했을 때 문자가 합쳐지는 결과가 나올 수 있기 때문.
	//연산 외에도 메서드 호출시 인자값을 정수로 보내서 문자열로 처리하는 또는 반환하는 경우에도 필요.
	//변환하는 방법은 여러가지가 있다.
		
		public static void main(String[] agrs) {
			//[1]:정수 선언
			int a = 12345;
			String str = "12345";
		//	System.out.println(a.length());   //에러Err
			System.out.println(str.length());  //메소드(length,자릿수or길이),5
			
			//[2]:정수->문자열로 변환->자릿수 구하기
			String stra = String.valueOf(a);  // 메소드 String.valueOf ( 정수로 문자열로 변환하는 메소드)
			System.out.println(stra.length());
			
			//[3]:문자열+정수열 = ?
			System.out.println(12345+1); //12346
			System.out.println(str+1);  //123451
			
			//[4]:문자열->정수로 변환
			int b = Integer.valueOf(str); //메소드 Integer.valueOf (문자열을 정수로 변환하는 메소드)
			System.out.println(b+1);
			
		}


}