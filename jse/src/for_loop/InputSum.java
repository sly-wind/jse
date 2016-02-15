package for_loop;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int op1 = sc.nextInt(), op2 = sc.nextInt(), result;
		
		if(op1 < op2){
			result = op1; op1 = op2; op2 = result;
		}
		
		result = 0;
		for(int i = op2; i < op1; i++)
			result+=i;
		
		System.out.println(result);
		sc.close();
	}
}
