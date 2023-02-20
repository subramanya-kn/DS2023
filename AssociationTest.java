
public class AssociationTest {

	public static void main(String[] args) {
	
		Calculator calci = new Calculator();
		calci.calculateWhat1();
		System.out.println("---------");
		calci.calculateWhat2(10, 20);
		System.out.println("---------");
		
		int ans = calci.calculateWhat3(50, 60);
		System.out.println("ans : "+ans);
		
		System.out.println("---------");
		
		
		int answer = calci.calculateWhat4();
		System.out.println("answer : "+answer);

		
	}
}

class Calculator {	
	//1. Function without arguments/without return value
	void calculateWhat1() {
		System.out.println("NoRETURN calculateWhat(NO ARGUMENT)");
	}
	//2. Function with arguments/without return value
	void calculateWhat2(int x, int y) {
		System.out.println("NoRETURN calculateWhat(int,int)");
		int sum =  x + y; System.out.println("Addition is : "+sum);
	}
	//3. Function with argument(s)/with return value
	int calculateWhat3(int x, int y) {
		System.out.println("int  calculateWhat(int,int)");
		return  x + y;
	}		
	//4. Function without argument(s)/BUT with  return value
	int calculateWhat4() {
		System.out.println("int  calculateWhat()");
		return  55 + 66;
	}
}










/*
class WashingPowder
{
	String brand; //Surf/Tide/Rin/Nirma/Wheel
	int quantity; //gms/kg
	String type; //front/top
	public WashingPowder(String brand, int quantity, String type) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.type = type;
	}
	public WashingPowder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
*/
