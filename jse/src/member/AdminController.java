package member;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminController {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		AdminService as = new AdminServiceImpl();
		String userId = "", name = "";
		MemberBean mb;
		ArrayList<MemberBean> mbList;
		
		while(true){
		
			System.out.print("---- Menu ----"
					+ "\n 1. Sign in."
					+ "\n 2. Find member by id"
					+ "\n 3. Find members by name"
					+ "\n 4. Count number of members by name."
					+ "\n 5. Count all members"
					+ "\n 6. Drop Out."
					+ "\n 7. Exit"
					+ "\nInput: ");
			
			switch(sc.nextInt()){
			case 1:
				System.out.print("1. Sign In"
						+ "\n Enter your id: ");
				
				userId = sc.next(); 
				while(as.searchById(userId) != null){
					System.out.print(" This Id has already exist. Plean Try other id."
							+ "\n Enter id: ");
					userId = sc.next();
				}
				
				MemberBean newMb = new MemberBean();
				newMb.setUserId(userId);
				
				System.out.println(" Ok, you can use the id. Please give other information");
				System.out.print(" Password: ");	newMb.setPassword(sc.next());
				System.out.print(" Name: "); 		newMb.setName(sc.next());
				System.out.print(" Address: ");	 	newMb.setAddr(sc.next());
				System.out.print(" Birthday: "); 	newMb.setBirth(sc.nextInt());
				
				as.join(newMb);
				break;
			
			case 2:
				System.out.print(" 2. Find member by id."
						+ " Press any id: ");
				
				mb = as.searchById(sc.next());
				if(mb != null)
					System.out.println("\tUser id: " + mb.getUserId()
									+ "\n\tName: " + mb.getName()
									+ "\n\tAddress: " + mb.getAddr()
									+ "\n\tBirthday: " + mb.getBirth());
				else	
					System.out.println("Wrong Id.");
				break;
			
			case 3:
				System.out.print("3. Find members by name."
						+ " Press any name: ");
				name = sc.next();
				mbList = as.searchByName(name);
				
				if(mbList == null)
					System.out.println("No users.");
				else{
					System.out.println("\tID List of " + name + "'s");
					for(MemberBean m: mbList)
						System.out.println("\t " + m.getUserId());
				}
				break;
				
			case 4:
				System.out.print("4. Count members by name."
						+ " Press any name: ");
				System.out.println(" " + as.searchCountByName(sc.next()) + " people");
				break;

			case 5:
				System.out.println("5. Count all members.");
				System.out.println(" " + as.countAll() + " people");
				break;
				
			case 6:
				System.out.print("6. Drop Out."
								+ "\nPress id: ");
				if(as.remove(sc.next()))
					System.out.println("Successfully deleted.");
				else
					System.out.println("Failed.");
				break;
				
			case 7:
				System.out.println("Good Bye.");
				return;
			default:
				System.out.println("Sorry, Wrong Input.");
				break;
			}
			
			
		}
		
	}
	
}
