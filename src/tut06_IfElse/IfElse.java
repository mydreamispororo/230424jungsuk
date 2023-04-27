package tut06_IfElse;

public class IfElse {

	public static void main(String[] args) {
		//if ~ else : 검증
		//출력 라인 1 : {} x 
		//if() -> 출력이 안되는 구문이 있을 수 있다.
		//if() else() : 참 거짓
		//if(조건) elseif(조건) else() = switch-case-break-default
		//조건에는 참조연산자 또는 논리연산자를 함께 사용
		
		//아이디가 admin이면 관리자페이지 마이페이지 로그아웃 표시, 아니면 마이페이지 로그아웃 표시
		
		String userid = "admin"; //사용자가 입력한 아이디
		String db = "admin"; //기존에 저장되어 있는 아이디
		
		if(userid.equals(db)) {
			System.out.print("관리자 페이지 | ");
			System.out.println("마이페이지 | 로그아웃");	
			
		}else if(userid.equals("")) {
			System.out.println("아이디를 입력해주세요.");
		}else {
			System.out.println("회원가입을 하셔야 사이트를 이용할 수 있습니다.");	
		}
		
	}

}
