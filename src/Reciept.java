
public abstract class Reciept {

	public void Reciept(){
		
	Account a = new Account("John Q. Public", 1234567, 56);
	System.out.println("+--------------------------------------+"); 
	System.out.println("|      Java Bank ATM Receipt           |"); 
	System.out.println("|      Wednesday, December 2, 2015     |");
	System.out.println("|      ATM Location # 123              |");
	System.out.println("|                                      |");
	System.out.println("|                                      |");
	System.out.println("|                                      |"); 
	System.out.println("|      Account Number:      " + a.getAcctnum() + "|"); 
	System.out.println("|      Customer:            " + a.getUsername() + "|");
	System.out.println("|      Transaction Type:    " + a.getAcctnum() + "|");
	System.out.println("|      Transaction Amount:  $500.00    |"); 
	System.out.println("|      Account Balance:     " + a.getBalance() + "|");
	System.out.println("|                                      |"); 
	System.out.println("|            Have a coffee day         |"); 
	System.out.println("|                                      |"); 
	System.out.println("+--------------------------------------+");
	
	}

}
