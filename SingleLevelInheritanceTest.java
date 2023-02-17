
public class SingleLevelInheritanceTest {

	public static void main(String[] args) {
		
		Point2D p1  = new Point2D(10,20);
		System.out.println("point2d p1 : "+p1);
		
		Point3D p2  = new Point3D(50,60,70);
		System.out.println("point3d p2 : "+p2);
		
		ColouredPoint3D p3 = new ColouredPoint3D(70, 80, 90, "Red");
		System.out.println("ColouredPoint3d p3 : "+p3);
	}
}

class Point2D
{
	int x;
	int y;
	
	public Point2D(int x, int y) {
		super();
		if(x<0) {
			System.out.println("cant take zero..");
		}
		else
			this.x = x;
		
		if(y<0) {
			System.out.println("cant take zero..");
		}
		else
			this.y = y;
		
	}
	
	@Override
	public String toString() {
		return "Point [ x=" + x + ", y=" + y + "]";
	}
}

class Point3D  extends Point2D //isA
{
	//inherited fields are present here (x,y)
	int z; //special
									//special
	public Point3D(int x, int y,     int z) {
		super(x,y); //borrowing the code of super class ctor
		this.z = z; //special
	}
	@Override
	public String toString() {
		return "Point3D [toString()=" + super.toString() + ", z=" + z + "]";
	}
}
//super() is used to call a ctor from another ctor

//super. is used to refer other functions and data

//Implicit super constructor Point3D() is undefined for default constructor. 
//Must define an explicit constructor

class ColouredPoint3D extends Point3D
{
	// x,y,z are present here
	String color;

	public ColouredPoint3D(int x, int y, int z, String color) {
		super(x, y, z);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColouredPoint3D [toString()=" + super.toString() + ", color=" + color + "]";
	}
	
}
