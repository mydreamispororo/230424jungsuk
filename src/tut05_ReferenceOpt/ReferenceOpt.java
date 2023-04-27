package tut05_ReferenceOpt;

public class ReferenceOpt {

	public static void main(String[] args) {
		//참조연산자(등호, 부등호) : 리턴타입(true, false)
		int num1 = 10;
		int num2 = 20;
		//초과, 미만, 이상, 이하, 같지않음, 같음
		boolean b = num1 > num2;
		System.out.println(b);
		System.out.println(num1 > num2);
		System.out.println(num1 != num2);
		System.out.println(num1 == num2);
		System.out.println("------------------------------------");
		
		//리턴타입 : 작업 후 결과가 어떻게(boolean) 나오나요?
		//논리연산자(등호, 부등호가 2개) : 리턴타입(true, false)
		
//		AND(두 조건을 다 만족하는가), OR(두 개중 하나라도 만족하는가)
//			이면서, 이고(AND)			이거나, 또는(OR ||)
		
		int x = 10;
		int y = 20;
		int a = 30;
		int c = 40;
		//x가 y보다 크고 a가 b보다 큰 논리연산의 결과를 표시하시오.
		if( (x > y) || (a > c) ) {
			System.out.println("false");
		}
		
		System.out.println((x > y) || (a > c));
		
		
		
		
		
		

	}

}
