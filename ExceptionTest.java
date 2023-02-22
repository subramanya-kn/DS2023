
public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("Begin main");
		
		Calculator calci = new Calculator();
		calci.divide3("100", "2a");
		
		System.out.println("End main");

	}
}

class Calculator
{
	void divide1(int num, int deno) {
		System.out.println("num  : "+num);
		System.out.println("deno : "+deno);
		System.out.println("dividing "+num+" by "+deno);
		if(deno==0) {
			System.out.println("Not a number");			
		}
		else {
			int div = num / deno;
			System.out.println("div  : "+div);
		}
	}
	
	
	void divide2(int num, int deno) {
		System.out.println("num  : "+num);
		System.out.println("deno : "+deno);
		System.out.println("dividing "+num+" by "+deno);
		
		try {
			int div = num / deno;
			System.out.println("div  : "+div);
		}
		catch(ArithmeticException e) {	
			System.out.println("Not a number");			
		}
	}
	
	void divide3(String num, String deno) {
		System.out.println("num  : "+num);
		System.out.println("deno : "+deno);
		System.out.println("dividing "+num+" by "+deno);
		
		try {
			int x = Integer.parseInt(num);
			int y = Integer.parseInt(deno);
			
			int div = x / y;
			System.out.println("div  : "+div);
		}
		catch(ArithmeticException e) {	
			System.out.println("Not a number");			
		}
		catch(NumberFormatException e) {
			System.out.println("Please supply numbers...");
		}
		catch(RuntimeException e) {
			
		}
		catch(Exception e) {
			
		}
	}
	
}