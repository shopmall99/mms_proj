package mms.member.controller;
//6. 사용자의 전체 요청을 제어하는 클래스 구현
import java.util.Scanner;
import mms.member.action.Action;

public class MemberController {
	
	public void processRequest(Action action,Scanner sc){
		try{
		action.execute(sc);
		//인터페이스의 레퍼런스 변수가 인터페이스를 구현한 클래스 객체를 참조하며
		//인테페이스에 정의된 메소드를 호출하면 실질적으로 각 클래스에서 구현된 메소드가 호출된다.
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
