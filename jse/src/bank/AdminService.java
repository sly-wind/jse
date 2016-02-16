package bank;

public interface AdminService {

	public int countAll();
	public String searchAccountByAccountNo(int accountNo);
	public AccountBean[] searchAccountByName(String name);
	public String closeAccount(int accountNo);
	public int searchCountByName(String name);
		
}
