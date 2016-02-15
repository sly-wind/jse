package operation;

import java.util.Scanner;

public class Kaup {

	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		double ht, wt, index;
		ht = sc.nextDouble(); wt = sc.nextDouble();
		index = (10000 * wt) / (ht * ht);
		
		System.out.print(name + "님은 ");
		
		if(index > 30) System.out.print("비만");
		else if(index > 24) System.out.print("과체중");
		else if(index > 20) System.out.print("정상");
		else if(index > 15) System.out.print("저체중");
		else if(index > 13) System.out.print("마름");
		else if(index > 10) System.out.print("영양실조");
		else System.out.print("소모증");
		
		System.out.println("이다.");
		sc.close();
	}
	
}
