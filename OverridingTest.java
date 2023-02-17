
public class OverridingTest {

	public static void main(String[] args) {
		
		GrandFather grandFather = new GrandFather();
		grandFather.wakeUp();
		grandFather.farming();
		
		System.out.println("-------");
		
		Father father = new Father();
		father.wakeUp();
		father.farming();
		father.banking();
	
		System.out.println("-------");
		
		Child child = new Child();
		child.wakeUp();
		child.javaCoding();
		child.banking();
		child.farming();
		
	}
	
}

class GrandFather
{
	int land=20;
	int gold=2;

	void farming() { //overridden/hidden
		System.out.println("GrandFather is farming...");
	}
	void wakeUp() {
		System.out.println("GrandFather is waking up at 4.30");
	}
}
class Father extends GrandFather
{
	void farming() { //re-defn / overriding /hiding
		System.out.println("Father is farming..using tractor...");
	}
	void wakeUp() {
		System.out.println("Father is waking up at 5.30");
	}
	void banking() {
		System.out.println("Father is banking...via bank visits...");
	}
}

class Child extends Father
{
	void farming() { //re-defn / overriding /hiding
		System.out.println("Child is farming..using robos...");
	}
	void wakeUp() {
		System.out.println("Child is waking up at 6.30");
	}
	void javaCoding() {
		System.out.println("Child is java coding...");
	}
	void banking() {
		System.out.println("Child is banking...via mobile....");
	}
}
