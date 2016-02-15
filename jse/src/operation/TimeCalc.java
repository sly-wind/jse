package operation;

import java.util.Scanner;

public class TimeCalc {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 시간과 분과 초로 바꾸어Dream.");
		
		int sec = sc.nextInt();
		
		int hour = sec / 3600; sec = sec % 3600;
		int min = sec / 60; sec = sec % 60;
		
		System.out.println(hour + "시간 " + min + "분 " + sec + "초.");
	
		sc.close();
	}
}
