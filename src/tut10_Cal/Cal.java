package tut10_Cal;

import tut10_Cal.model.Calculator;

//사칙연산 작업을 할 객체 생성 준비
//동작메소드이름() : add() sub() mul() div()
//더하거나 빼거나 곱하거나 나눌 매개변수에 따라 오버로딩을 진행

//접근제한자 리턴타입 메소드이름(매개변수1, 매개변수2..) {
//return -> 리턴 타입이 void일 때는 없어도 됨
//}

//다른폴더에 있는 자바 파일을 불러올 때는 import

public class Cal {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.disp("코리아아이티");

		System.out.println(cal.add(10, 100, 50));
		System.out.println(cal.add(10, 50));

		System.out.println(cal.mul(10, 20, 20));
		System.out.println(cal.div(10, 20));

	}

}
