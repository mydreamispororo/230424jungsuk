package tut06_IfElse;

public class IfElse2 {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 7;
		int num3 = 9;
		//num2보다 num1이 크고 num3보다 num1이 크면
		//Success,
		//num1 보다 num2 가 크거나 num3이 num2 보다 크면
		//Fail,
		//그 외에는 System.exit(0)을 표시하시오.
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("Success");
		}else if((num1 < num2) || (num2 < num3)) {
			System.out.println("Fail");
		}else {
			System.out.println("System.exit(0)");
		}
		
		
		
		
		
		
	}

}
