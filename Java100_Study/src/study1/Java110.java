package study1;

public class Java110 {
	public static void main(String[] args) {
	//[!]: 관계 연산자=>==(같냐?) /!=(같지 않냐?) />(크냐)/>=
	//<(작냐)/<=(작거나같냐>)
	//관계연산자를사용해서연산을 수행하면 그 결과는 참(true),거짓(false)이된다.-->따라서,그결과를 받는 타입은boolean.
	int kor=70,eng=40,math=70;
	boolean rst1,rst2,rst3,rst4,rst5,rst6;
	
	rst1 = kor == eng;   //false (같냐)
	rst2 = kor != eng;   //true  (같지않냐)
	rst3 = kor > eng;    //true  (국어점수보다 영어점수가 크냐)
	rst4 = kor >= math;  //true
	rst5 = kor < eng;    //false
	rst6 = kor <= math;  //true
	
	System.out.println(rst1);
	System.out.println(rst2);
	System.out.println(rst3);
	System.out.println(rst4);
	System.out.println(rst5);
	System.out.println(rst6);
//System.out.println(rst1+"\t"+rst2+"\t"+rst3+"\t"+rst4+"\t"+rst5+"\t"+rst6);이런방법도 있다.    	
	
   }

}
