package tut07_Ternary;

public class Ternary {

	public static void main(String[] args) {
		//if(조건) ~ else = 조건 ? "참일때" : "거짓일때";
//							1		2		  3 : 3항 연산자
		
		//숫자 25가 홀수(Odd)인지 짝수(Even)인지 표시하시오
		int num = 25;
		
		if(num % 2 == 0) {
			System.out.println("짝수(Even Number)입니다.");
		}else {
			System.out.println("홀수(Odd Number)입니다.");
		}
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		System.out.println("----------------------------");
		
		
		//1 normal -> silver 2 -> gold 3 -> 5 admin
		int grade = 5;
		
		System.out.println((grade > 1) ? "Member" : "Guest");
		System.out.println((grade > 1 && (grade < 5)) ? "Member" : "admin");
		
		
		
		

		

	}

}
