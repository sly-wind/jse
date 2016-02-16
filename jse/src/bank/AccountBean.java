package bank;

public class AccountBean {

	/* Member Field(Defines member variables) */
	public static String BANK = "신한";
	private int accountNo;
	private String name;
	private int money;
	private int password;
	private String msg;
	
	/* Member Method(Defines member methods) */
	public AccountBean(){
		this.money = 0;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getMsg() {
		return "[신한은행]" + name + " : " + accountNo + ", 잔고 " + money;

	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
