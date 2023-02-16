
public class BankTest {

	public static void main(String[] args) {
		
		int accountNumber;
		String accountHolder;
		float bankBalance; //FIELD of the Object
		
		
		//ClassNAme  refToObj    allocator constructor
		BankAccount baObjRef1  = new       BankAccount();
		BankAccount baObjRef2  = new       BankAccount();
		BankAccount baObjRef3  = new       BankAccount();
		BankAccount baObjRef4  = new       BankAccount();
		BankAccount baObjRef5  = new       BankAccount();
		BankAccount baObjRef6  = new       BankAccount();
		BankAccount baObjRef7  = new       BankAccount();

		baObjRef1.deposit(500);
		baObjRef2.deposit(300);
		baObjRef3.deposit(250);
		baObjRef4.deposit(350);
		baObjRef5.deposit(22);
		baObjRef6.deposit(67);
		baObjRef7.deposit(699);
		
		
	}

}

class BankAccount //just a blueprint 
{
	
	void withdraw()
	{
		System.out.println("withdrawing...");
	}
	void deposit(float amount) 
	{
		System.out.println("depositing..."+amount);
	}
	void fundTransfer() 
	{
		System.out.println("transferring funds....");
	}
}












