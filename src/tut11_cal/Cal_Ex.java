package tut11_cal;

public class Cal_Ex {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setNum1(100); // 필드 num1 저장
		c.setNum2(-1); // 필드 num2 저장

		c.setUserid("rksekkfak");

		System.out.println(c.getNum1());
		System.out.println(c.getNum2());

		System.out.println(c.getNum1() * c.getNum2());

		System.out.println(c.getUserid());
	}

}
