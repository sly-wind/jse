package bank;

import java.util.Scanner;

public class AccountController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int accountNum = 0;
		String name, pwd;
		
		while (true) {

			System.out.println("업무선택 : 1.계좌개설 2.입금 3.출금 4.잔액조회 5.종료");

			switch (sc.next()) {
			case "1":
				System.out.println("이름, 비밀번호 ");
				
				
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				return;
			default:
				System.out.println("Wrong Input.");
			}

			System.out.println("아무 키나 입력해주십시오.");
			sc.next();
		}
	}
}
