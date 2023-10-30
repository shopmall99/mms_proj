package mms.member.action;
//7-1 회원등록 요청 처리하는 Action 클래스 구현
import java.util.Scanner;
import mms.member.svc.MemberAddService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

//각 요청을 제어하는 클래스
//주로 실질적인 비지니스 로직을 처리하기 전에 필요한 선행작업들을 처리함.
//만약, 웹에서 회원등록 페이지에 정보를 입력하고 회원등록 요청이 넘어왔을 때 페이지에서 넘어오는 정보를 받는다든지......
public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {

		ConsoleUtil cu = new ConsoleUtil();
		Member newMember = cu.getNewMember(sc);//1. 콘솔 입출력

		MemberAddService memberAddService = new MemberAddService();//2. service
		boolean isAddSuccess = memberAddService.addMember(newMember);

		if (isAddSuccess) {
			cu.printAddSuccessMessage(newMember);
		} else {
			cu.printAddFailMessage(newMember);
		}
	}

}
