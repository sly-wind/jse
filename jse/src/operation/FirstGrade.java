package operation;

import java.util.Scanner;

public class FirstGrade {

	public static int num = 3;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String[] nameArr = new String[num];
		double[] scoreArr = new double[num];

		for(int i = 0; i < num; i++){
			nameArr[i] = sc.next();
			scoreArr[i] = sc.nextDouble();
		}
			
		int winner = 0;
		for(int i = winner + 1; i < num; i++)
			if(scoreArr[winner] < scoreArr[i]) winner = i;
		
		System.out.println("Winner is " + nameArr[winner] + ".");
		
		sc.close();
		return;
	}
	
}
