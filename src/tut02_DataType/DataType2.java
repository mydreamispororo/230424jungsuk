package tut02_DataType;

public class DataType2 {

	public static void main(String[] args) {
//		컴퓨터는 0, 1만 읽을 수 있음
//		영어 1글자는 1byte -> 8bit -> 00000000(8자리)
//		00000000(2) -> b -> 0b
//		0000 0000(16) : 123456789 A B C D E F
//		Ox 1	1 -> x -> hexa(16진수)
		
		//2진수는 2(2) 2(1) 2(0)
		int num = 0b101;
		System.out.println(num);
		
		//16진수는 16(1) 16(0)
		int num2 = 0x7E;
		System.out.println(num2);
		
		//부동소수점 : 가수부 * 지수부 = 1.XX * 2(n)
		//e 지수표기법 e10 : 10은 제곱근
		double d = 12e11;
		System.out.println(d);
		

	}

}
