
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		
		myPhone.dial(); // compile-time binding 
		myPhone.dial("Abhishek");
		myPhone.dial(9820443464L);
		byte interComm=120;
		myPhone.dial(interComm);
		
		byte countryCode=11;
		myPhone.dial(countryCode, 9820443464L);
		myPhone.dial(9820553565L,countryCode);
		
		
	}

}
class Phone
{
	void dial() {
		System.out.println("dial() nowhere...");
	}
	void dial(byte intercommNumber) {
		System.out.println("dial(byte): dialing intercomm : "+intercommNumber);
	}
	void dial(String name) {
		System.out.println("dial(String): dialing by name : "+name);
	}
	void dial(long mobileNumber) {
		System.out.println("dial(long): dialing by mobile : "+mobileNumber);
	}
	void dial(byte countryCode,long mobileNumber) {
		System.out.println("dial(byte,long): dialing by countryCode : "+countryCode+" mobile number : "+mobileNumber);		
	}
	void dial(long mobileNumber,byte countryCode) {
		System.out.println("dial(long,byte): dialing by mobile : "+mobileNumber+" with country code : "+countryCode);		
	}
}
