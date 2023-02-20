
public class PassingObjectTEst {
	public static void main(String[] args) {
		
		Curd c1 =  new Curd("Cow","Thick","offwhite","Sour",500);			
		System.out.println("The Curd : "+c1);
		
		Sugar sugar = new Sugar("White", "Crystal", 200, "WhiteSilver", "Very Sweet", false);
		
		

		Kitchen myKitchen = new Kitchen();
		
		Lassi myLassi = myKitchen.makeLassi(c1, sugar);
		
		System.out.println("Lassi is ready  : "+myLassi);
	}

}

class Lassi
{
	int quantity;
	String flavour;
	String density;
	public Lassi(int quantity, String flavour, String density) {
		super();
		this.quantity = quantity;
		this.flavour = flavour;
		this.density = density;
	}
	@Override
	public String toString() {
		return "Lassi [quantity=" + quantity + ", flavour=" + flavour + ", density=" + density + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public Lassi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

class Kitchen
{
	
//producesA			//usesA   usesA
	Lassi makeLassi (Curd x, Sugar y) //x from makeLassi = c1 from main method
	{
		System.out.println("ok...lets start making lassi...");
		System.out.println("what is the quantity of the curd..."+x.getQuantity()+" gms");
		System.out.println("what is the quantity of the sugar..:"+y.getQuantity()+ " gms");
		System.out.println("Lets blend this "+x.getDensity()+ " curd with "+y.getTaste()+" sugar to make a lassi...");
		
		Lassi lassi = new Lassi();
		lassi.setDensity(x.getDensity()); //density of curd is set to the lassi
		lassi.setFlavour(y.getTaste()+" Kesar"); // sugar's taste + additional flavour is set the flavour of lassi
		lassi.setQuantity(x.getQuantity()); //quantity of curd is set to lassi
		
		return lassi;
		
	}
}


class Sugar
{
	String type;
	String form;
	int quantity;
	String color;
	String taste;
	boolean organic; // false means not organic, true means organic
	
	public Sugar(String type, String form, int quantity, String color, String taste, boolean organic) {
		super();
		this.type = type;
		this.form = form;
		this.quantity = quantity;
		this.color = color;
		this.taste = taste;
		this.organic = organic;
	}
	@Override
	public String toString() {
		return "Sugar [type=" + type + ", form=" + form + ", quantity=" + quantity + ", color=" + color + ", taste="
				+ taste + ", organic=" + organic + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public boolean isOrganic() {
		return organic;
	}
	public void setOrganic(boolean organic) {
		this.organic = organic;
	}
	
	
	
	
}
class Curd
{
	String type;
	String density;
	String color;
	String taste;
	int quantity;
	
	public Curd(String type, String density, String color, String taste, int quantity) {
		super();
		this.type = type;
		this.density = density;
		this.color = color;
		this.taste = taste;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Curd [type=" + type + ", density=" + density + ", color=" + color + ", taste=" + taste + ", quantity="
				+ quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

/*
class Curd
{
	
	
	public Curd(String type, String density, String color, String taste, int quantity) {
		super();
		this.type = type;
		this.density = density;
		this.color = color;
		this.taste = taste;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Curd [type=" + type + ", density=" + density + ", color=" + color + ", taste=" + taste + ", quantity="
				+ quantity + "]";
	}

	public String getType() {
		return type;
	}

	public String getDensity() {
		return density;
	}

	public String getColor() {
		return color;
	}

	public String getTaste() {
		return taste;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDensity(String density) {
		this.density = density;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
}
*/




/*System.out.println("Quantity : "+c1.getQuantity());
System.out.println("Taste    : "+c1.getTaste());

System.out.println("curd Memory address        : "+c1.hashCode());

Curd c2 = c1;
System.out.println("anotherCurd Memory address : "+c2.hashCode());

Curd c3 = c2;
System.out.println("oneMoreCurd Memory address : "+c3.hashCode());

System.out.println("----------");c1.setTaste("Sweet");

System.out.println("The      Curd : "+c1);
System.out.println("Another  Curd : "+c2);
System.out.println("One More Curd : "+c3);

c2.setQuantity(300);

System.out.println("----------");

System.out.println("The      Curd : "+c1);
System.out.println("Another  Curd : "+c2);
System.out.println("One More Curd : "+c3);

c3.setDensity("Thin");


System.out.println("----------");

System.out.println("The      Curd : "+c1);
System.out.println("Another  Curd : "+c2);
System.out.println("One More Curd : "+c3);

Curd x = c1;

System.out.println("--------");
x.setTaste("SourAndSweet");

System.out.println("The      Curd : "+c1);
System.out.println("Another  Curd : "+c2);
System.out.println("One More Curd : "+c3);
System.out.println("One More Curd : "+x);
	
*/

