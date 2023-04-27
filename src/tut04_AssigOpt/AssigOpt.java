package tut04_AssigOpt;

public class AssigOpt {

	public static void main(String[] args) {
		//Operator
		//정수타입의 변수 선언 후 10을 대입하고 2를 증가하는 opt
		int i = 10;
		 //i = i + 2;
		 i += 2;
		 
		 //전위증감연산자 : 부호가 앞에 있는 ++num, --num
		 //후위증감연산자 : 부호가 뒤에 있는 num++, num--
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(++num1);
		System.out.println(num1++);
		System.out.println(num1);
		
	}

}
