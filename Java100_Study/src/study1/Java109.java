package study1;

public class Java109 {
	//연산자
	//수치 연산자를 사용한 연산에서 소숫점 결과가 예상과 다르게 나오는 것에 대해서 설명해보시오
	//아래의 코드 결과가 올바르게 나오도록 수정해보시오.
	//이 문제는 자바의 기본적인 수치 연산자에 대해서 알고 있는지를 묻는 문제이다. (별도 메모 : rst1 ->알에스원이라고 읽음)
	   public static void main(String[] args) {
	     //[!]:연산자의 결과-> 정수끼리라도 나누기의 경우 소숫점 형태가 나올 수 있음.
		   int a = 60,b = 8;
		   int rst1;double rst2,rst3,rst4;
		   
		   rst1 = a/b;
		   System.out.println(rst1);    // 7.5가아니라 7이출력이 됨->타입이정수형이므로->실수형으로 변환.
		   System.out.println((double)rst1);//이러면7.5가 아니라7.0->리턴받는변수를실수형으로하더라도원하는결과를 얻지는 못한다.
		   
		   rst2=(double)a/(double)b; //어느 한쪽의 값을 double타입으로변환. 이렇게 바꾸면 7.5가 된다
		   System.out.println(rst2); //(double)을 없애면-->7.0,(double)을 붙이면 7.5가 나온다.
		   
		   rst3=100/3;
		   rst4=100/3.0;
		   System.out.println(rst3);
		   System.out.printf("세 과목의 평균은 %.1f입니다.\n",rst4);
		   
		   
	 
	   }
}
