package operation;

import java.util.Scanner;

public class TimeCalc {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 시간과 분과 초로 바꾸어Dream.");
		System.out.print("초: ");
		int sec = sc.nextInt();
		
		int hour = sec / 3600; sec = sec % 3600;
		int min = sec / 60; sec = sec % 60;
		
		if(hour > 0) 
			System.out.println( hour + "시간 " + min + "분 " + sec + "초.");
		else if(min > 0)
			System.out.println( min + "분 " + sec + "초.");
		else if(sec > 0)
			System.out.println( sec + "초.");
		else
			System.out.println("음수는 넣지 마시죠ㅎㅎ");
		
		sc.close();
	}
}
