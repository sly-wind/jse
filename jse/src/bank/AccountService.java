package bank;

public interface AccountService {

	public String open(String name, int pwd);
	public void deposit(int money);
	public void withdraw(int money);
	public String search();
}
