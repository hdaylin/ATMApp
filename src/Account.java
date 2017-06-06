
public class Account {

	private String username; 
	private int acctnum; 
	private int PIN; 
	private double balance; 
	private double deposit; 
	private double withdraw; 
	
	
	public Account(){
		
		
	} 
	
	public Account(String name, int acctnum, int PIN){
		this.username = name; 
		this.acctnum = acctnum; 
		this.PIN = PIN;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public String getName() {
		return username;
	}


	public void setName(String name) {
		this.username = name;
	}


	public int getAcctnum() {
		return acctnum;
	}

	
	public void setAcctnum(int acctnum) {
		this.acctnum = acctnum;
	}
	
	
	
	
	
}
