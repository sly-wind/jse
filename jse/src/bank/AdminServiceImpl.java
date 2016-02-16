package bank;

public class AdminServiceImpl implements AdminService {

	private static int ACCOUNT_MAX = 100;
	int cnt;
	AccountBean[] accounts;
	AccountService as;
	
	AdminServiceImpl(){
		cnt = 0;
		accounts = new AccountBean[ACCOUNT_MAX];
	}
	
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String searchAccountByAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] searchAccountByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
