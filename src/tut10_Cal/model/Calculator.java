package tut10_Cal.model;

public class Calculator {
	
	public void disp(String title) { //void 없다 = return이 없다.
		System.out.println("=====" + title + " 계산기 =====");
	}
	
	
	
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) { //메소드 오버로딩
		
		return num1 + num2 + num3;
	}
	
	public int sub(int num1, int num2) {
		
		return num1 - num2;
	}
	
	//곱하기 : 리턴타입 정수 3개 곱하기 메소드
	//main 메소드에서 실행해 보기
	
	public int mul(int num1, int num2, int num3) {
		
		return num1 * num2 * num3;
	}
	
	//나누기 : 리턴타입 실수 2개 나누기 메소드
	//main 메소드에서 실행해 보기
	public double div(int num1, int num2) {
		
		return (int) num1 / num2;
	}
	
	
	
}

	
	

