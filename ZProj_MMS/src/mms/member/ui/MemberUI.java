package mms.member.ui;
//사용자가 메뉴를 선택할수 있는 화면을 구성해 주는 클래스
import java.util.Scanner;
import mms.member.action.Action;
import mms.member.action.MemberAddAction;
import mms.member.action.MemberListAction;
import mms.member.action.MemberModifyAction;
import mms.member.action.MemberRemoveAction;
import mms.member.controller.MemberController;

public class MemberUI {
	public static void main(String[] args)  {

		boolean isStop = false;
		MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("=====회원관리 프로그램=====");
			System.out.println("1.회원등록");
			System.out.println("3.회원정보수정");
			System.out.println("4.회원정보삭제");
			System.out.println("5.프로그램종료");
			System.out.print("메뉴번호 : ");
			int menu = sc.nextInt();
			Action action = null;

			switch (menu) {
			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:
				action = new MemberModifyAction();
				break;
			case 4:
				action = new MemberRemoveAction();
				break;
			case 5:
				System.out.println("프로그램 종료");
				isStop = true;
				break;
			default:
				break;
			}
			//1.위에서 받은 action안에 있는 execute(sc) 실행- MemberController를 사용하지 않는 경우
			try {
				action.execute(sc);
			} catch (Exception e) {
				
			}
			//2. MemberController를 사용한 경우
//			if (action != null) {
//				memberController.processRequest(action, sc);//action.execute(sc)
//			}
		} while (!isStop);
	}
}