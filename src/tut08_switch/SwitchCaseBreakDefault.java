package tut08_switch;


public class SwitchCaseBreakDefault {

	public static void main(String[] args) {
		//if ~ elseif ~ else = switch
		//		(조건문)			등호, 부등호 x
		//Create Read Update Delete
		//회원가입(CRUD)
		//1.회원가입(Create) 2.회원상세보기(Read) 3.회원수정(Update) 4.회원삭제(Delete) 5.종료
		int sel = 1;
		
		if(sel == 1) {
			System.out.println("회원가입을 진행합니다.");
			String query = "INSERT INTO member VALUES();"; //VALUE()에 아이디(변수)를 집어넣으면 데이터베이스로 입력됨
			System.out.println("DB 입력 명령 : " + query);
			
		}else if(sel == 2) {
			System.out.println("회원정보 상세 보기합니다.");
			String query = "SELECT * FROM member WHERE ~ ";
			System.out.println("DB 상세보기 명령 : " + query);
			
		}else if(sel == 3) {
			System.out.println("회원정보를 수정합니다.");
			String query = "UPDATE member SET ~ WHERE ~ ";
			System.out.println("DB 회원정보 수정 명령 : " + query);
			
		}else if(sel == 4) {
			System.out.println("회원정보를 삭제합니다.");
			String query = "DELETE * FROM member WHERE ~ ";
			System.out.println("DB 정보 삭제 명령 : " + query);
			
		}else {
			System.out.println("회원정보 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		
		
		String query = "";
		switch(sel) {
		case 1:
			System.out.println("회원가입을 진행합니다.");
			query = "INSERT INTO member VALUES();";
			System.out.println("DB 입력 명령 : " + query);
			break;
			
		case 2:
			System.out.println("회원정보 상세 보기합니다.");
			query = "SELECT * FROM member WHERE ~ ";
			System.out.println("DB 상세보기 명령 : " + query);
			break;
			
		case 3:
			System.out.println("회원정보를 수정합니다.");
			query = "UPDATE member SET ~ WHERE ~ ";
			System.out.println("DB 회원정보 수정 명령 : " + query);
			break;
			
		case 4:
			System.out.println("회원정보를 삭제합니다.");
			query = "DELETE * FROM member WHERE ~ ";
			System.out.println("DB 정보 삭제 명령 : " + query);
			break;

		default:
			System.out.println("회원정보 프로그램을 종료합니다.");
			System.exit(0);
			
		}
		
		
		//등급이 1이면 Guest 2이면 Member 3이면 Admin
		//2이상이면 회원입니다.
		System.out.println();
		System.out.println();
		
		
		int grade = 2;
		
		if(grade > 1) {
			System.out.println("회원입니다.");
		}else {
			System.out.println("Guest 입니다.");
		}
		
		System.out.println("--------------------------");
		
		switch(grade) {
		case 1:
			System.out.println("Guest 입니다.");
			break;
			
		case 2:
		case 3:
			System.out.println("회원 입니다.");
			break;
			
		default:
		}		
		
	}

}
