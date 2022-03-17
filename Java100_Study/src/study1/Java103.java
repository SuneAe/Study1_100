package study1;

public class Java103 {
	//자바의 Primitive Data Type의 바이트 크기와 비트크기를 출력하는 코드를 구현하시오.
		//정수형 타입과 문자형	타입에 대해서만 구현한다.
		//이때,각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오.

		
			public static void main(String[] args) {
				//타입종류(byte,short,int,long,char) 1byte는 8bit다
			//	System.out.println(Byte.BYTES); //<== 바이트계산
			//	System.out.println(Byte.SIZE);  //<== 비트계산
				System.out.println("byte\t:"+Byte.BYTES+"(바이트)"+"-->"+Byte.SIZE+"(비트)\t"+Byte.MAX_VALUE+"~"+Byte.MIN_VALUE);
				System.out.println("short\t:"+Short.BYTES+"(바이트)"+"-->"+Short.SIZE+"(비트)\t"+Short.MAX_VALUE+"~"+Short.MIN_VALUE);
				//int는 --> Integer 변경해줘야 한다.
				System.out.println("int\t:"+Integer.BYTES+"(바이트)"+"-->"+Integer.SIZE+"(비트)\t"+Integer.MAX_VALUE+"~"+Integer.MIN_VALUE);
				System.out.println("long\t:"+Long.BYTES+"(바이트)"+"-->"+Long.SIZE+"(비트)\t"+Long.MAX_VALUE+"~"+Long.MIN_VALUE);
				//char를 정수형으로 출력하고 싶을때는 앞에(int)Character 이렇게 써야 정수형으로 출력가능하다.
				//문자는 양수만 가지고 있다. 음수가 없다.
				//char도 만찬가지로 char --> Character 변경해줘야 한다.
				System.out.println("char\t:"+Character.BYTES+"(바이트)"+"-->"+Character.SIZE+"(비트)\t"+Character.MAX_VALUE+"~"+Character.MIN_VALUE);
				System.out.println("char\t:"+(int)Character.BYTES+"(바이트)"+"-->"+(int)Character.SIZE+"(비트)\t"+(int)Character.MAX_VALUE+
						           "~"+(int)Character.MIN_VALUE);
				}

}
