package switch_case;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sci;
		
		name = sc.next();
		kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt(); sci = sc.nextInt();
		
		int total = kor + eng + math + sci;
		double avg = (double)total/4;  
		
		
		String result = name + "'s total grade is " + total + ", and average grade is " + avg;
		
		int key = (int)(avg / 10);	// local variable initializing
		String result2 = "";
		
		switch (key) {
		case 9: result2 = ", so you'll get scholarship."; break;
		case 10: result2 = ", so you'll get scholarship."; break;
		case 8: result2 = ", so you are passed."; break;
		case 7: result2 = ", so you are passed."; break;
		case 6: result2 = ", so you are passed."; break;
		default: result2 = ", so you are failed.";
		}
		
		System.out.println(result + result2);
		
		sc.close();
		return;
	}
}
