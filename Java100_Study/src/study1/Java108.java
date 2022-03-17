package study1;

public class Java108 {
	//연산자
	//수치 연산자에 대해서 설명해보세요.
	//이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 문제이다.
	//축양된 형태의 연산자를 사용하여 변수 a의 값을 증가시켜보시오.
	//이 문제는 수의 연산시 축약된 형태로 사용하는 방법에 대해서 알고 있는지를 묻는 문제이다.	
		public static void main(String[] args) {
			//[!]: 수치연산자-->+,-,*,/(몫),%(나머지 연산자)
		//	int a, b, c,d;
		//    a=60;b=8;c=300;d=400;
			
			
		//	System.out.println(a+b);
		//	System.out.println("a+b="+a+b);
		//	System.out.println("a+b="+(a+b)); //괄호가 먼저 연산이 된다.a+b=68
		//	System.out.println("a-b="+(a-b)); //52
	   	//	System.out.println("a*b="+(a*b));//480
		//	System.out.println("a/b="+(a/b)); //7몫
		//	System.out.println("a%b="+(a%b)); //나머지 4
			
		//	[!]:축양된형태
			int a = 0,b = 100;
			
			a = a+1;
			System.out.println(a);//1
			
			a+=1;// 이 형식이 많이 쓰인다.
			System.out.println(a);//2
			
			a-=1;
			System.out.println(a); //1 (1을 뺌)
			
			b++;
			System.out.println(b); // 101
			
			b++;
			System.out.println(b); // 102
			
			b--;
			System.out.println(b); // 101
			
			
			
			
			
			
		}


}
