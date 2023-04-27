package tut01_hello;

//스코프(scope) : 범위
public class Helloworld {

	public static void main(String[] args) { //이름() : 동작 - 메소드
//		숫자는 "", '' x
//		문자 '한글자'
//		문자열 "여러글자"
		
		//정수를 저장해서 출력
		int num, num2, num3; //스택 메모리 생성
		num = 10;
		num2 = 20;
		num3 = 30;

		
		System.out.println(num);
		System.out.println(num2 + num3);
		System.out.println(num2 + "/" + num3);
		System.out.println(num2 / num3); //몫
		System.out.println(num2 % num3); //나머지
			
		//문자를 저장해서 출력
		char c = 'A'; //char 글자도 숫자로 표현
		System.out.println("출력할 문자는 " + c);
		System.out.println((int) c); //(형변환) 변수명
		System.out.println((char) 65); //(형변환) 변수명
		System.out.println((char) 127); //(형변환) 변수명
		
		//문자열을 저장해서 출력 : String, new String();
		String str1 = "Hello2";
		String str2 = new String("Hello");
		System.out.println("String : " + str1);
		System.out.println("String new : " + str2);
		
		if(str1.equals(str2)) {
			System.out.println(str1 + "님 안녕하세요");
		}else {
			System.out.println("등록된 회원이 아닙니다.\n회원가입을 해 주세요");
		}
		
		//실수를 저장해서 출력
//		float(7자리 이상이면 정확도 x)
		float f = 1.124f;
//		double(15자리 이상이면 정확도x)
		double d = 1.124;
		
//		국어점수 수학점수 더해서 평균
		int kor = 100;
		int math = 100;
		int total = 0; //아직 결과값이 없을 때는 제일 작은 값
		double avg = 0.0;
		
		//true, false 불리언(boolean) 타입을 출력
		//회원가입 했는지 아닌지.
		
		//boolean은 false(0), true(0을 제외한 전부)
		//boolean b = false;		
		//회원가입을 했는지 아닌지 확인해 보기
		boolean b = true; //가입을 하지 않았다고 가정하고..
		if(b) {
			System.out.println("이미 회원가입이 되었습니다.");
		}else {
			System.out.println("회원가입 페이지로 이동합니다.");
		}
		
		
		
		
		//화면 밖으로 출력
		System.out.print("");//이어적기
		System.out.println(); //띄어적기
		//화면 안으로 입력
//		System.in;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
