
public class Test {

	public static void main(String[] args) {
		//Pen pen = new Pen();
		//pen.start();
		
		//System.out.println("----------");
		
		//FountainPen fountainPen = new FountainPen();
		//fountainPen.start();
		
		//Pen x = new FountainPen();
		//x.start();
		
		//Writeable x = new Chalk();
		//x.write();
		
		Chalk chalk = new Chalk();
		
		//Make a pen object, and on calling pen's start
		//it must invoke the chalks's write
	
	}
}

interface Writeable
{
	void write(); //public abstract
}
class Pen implements Writeable
{
	void start() {
		System.out.println("Lets start to write...");
		System.out.println("Lets take paper");
		System.out.println("Lets take a surface for the paper......");
		write();
	}
	public void write() { //MANDATORY OR NOT? YES
		System.out.println("Writing with pen.....");
	}
}

class FountainPen extends Pen //isA
{
	public void write() { //IS IT MANDATORY??? NO - overridden
		System.out.println("Writing with fountain pen.....");
	}
}

class Stone
{
		
}
class Chalk extends Stone implements Writeable
{
	public void write() { //mandatory
		System.out.println("Chalk is writing on the blackboard.....");
	}
}
