package study1;

public class Java104 {
	//정수,실수,문자형 타입의 변수 사용에서 틀린 곳을 찾아서 모두 수정하시오.
		//혹,에러가 안나더라도 올바르게 수정해주시오.
		//이 문제는 변수 선언과 사용시 주의할 점에 대해서 알고 있는지를 묻는 문제이다.

		
			public static void main(String[] args) {
				//[1]:변수 선언
				int a;  //정수가 저장될 변수 이름을 a로 만들어라
				int b;int c = 90;  // 나란히 써도 가능하다.
				double d;  //실수가 저장될 변수 이름을 d로 만들어라
				char e;   //문자가 저장될 변수 이름을c로 만들어라
				
				//[2]: 선언된 변수에 값을 대입
				a = 10;
				b = 20;
				d = 10;   //정수 10을 입력하면 10.0으로 출력한다.
				e = 'A';  //쌍따옴표하면 에러가 발생한다.
				
				//[3]:출력
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				
				//[4]:여러 개 변수 선언 및 초기화 --> 선언 후 값을 셋팅
				//[4-1]
			//	int w;  //선언만 해도 에러가 발생하지 않는다.
			//	int x, y, z = 900;//z만 초기화가 되고x,y는 초기화가 안됨.
			//	System.out.println("[4-1]:"+x+"-"+y+"-"+z);
				
				//[4-2]
				int x,y,z;
				x=900;
				y=900;
				z=900;
				System.out.println("[4-2]:"+x+"-"+y+"-"+z);
				
				//[4-3]
				int x1=300,y1=400,z1=500;
				System.out.println("[4-3]:"+x1+"-"+y1+"-"+z1);
				
				//[4-4]:같은 값으로 초기화시키는 방법
				//String str1,str2,str3;
				//str1,str2,str3="korea"; // 이렇게 선언하면 에러가 발생한다.
				
				String str1,str2,str3;
				str1 = str2 = str3 = "korea";
				System.out.println("[4-4]여러 문자열 변수 한꺼번에 초기화:"+str1+"-"+str2+"-"+str3);
				
				int i,j,k;
				i = j = k = 100;
				System.out.println("[4-4]여러 정수형 변수 한꺼번에 초기화:"+i+"-"+j+"-"+k);
				
			}


}
