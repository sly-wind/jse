package operation;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sci;
		
		name = sc.next();
		kor = sc.nextInt(); eng = sc.nextInt(); math = sc.nextInt(); sci = sc.nextInt();
		
		int total = kor + eng + math + sci;
		
		System.out.println(name + "'s Total Grade: " + total);
		System.out.println(name + "'s Average Grade: " + (double)total/4);
		
		sc.close();
		return;
	}
	
	
}
