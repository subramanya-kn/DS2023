
public class ConstructionOfHouse {

	public static void main(String[] args) {
		
	}

}

class Brick{
	int noOfbricks;
	int sizeOfbricks;
	int quality;
	int strength;
	public Brick(int noOfbricks, int sizeOfbricks, int quality, int strength) {
		super();
		this.noOfbricks = noOfbricks;
		this.sizeOfbricks = sizeOfbricks;
		this.quality = quality;
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Brick [noOfbricks=" + noOfbricks + ", sizeOfbricks=" + sizeOfbricks + ", quality=" + quality
				+ ", strength=" + strength + "]";
	}
	public int getNoOfbricks() {
		return noOfbricks;
	}
	public void setNoOfbricks(int noOfbricks) {
		this.noOfbricks = noOfbricks;
	}
	public int getSizeOfbricks() {
		return sizeOfbricks;
	}
	public void setSizeOfbricks(int sizeOfbricks) {
		this.sizeOfbricks = sizeOfbricks;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
}

class Cement{
	
	int cementQuantity;
	int cementQuality;
	
	int price;
	public Cement(int cementQuantity, int cementQuality, String cementBrand, int price) {
		super();
		this.cementQuantity = cementQuantity;
		this.cementQuality = cementQuality;
	
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cement [cementQuantity=" + cementQuantity + ", cementQuality=" + cementQuality + ", cementBrand="
				+ ", price=" + price + "]";
	}
	public int getCementQuantity() {
		return cementQuantity;
	}
	public void setCementQuantity(int cementQuantity) {
		this.cementQuantity = cementQuantity;
	}
	public int getCementQuality() {
		return cementQuality;
	}
	public void setCementQuality(int cementQuality) {
		this.cementQuality = cementQuality;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

class Plan{
	
	Construct constructHouse(Brick b, Cement c) {
		
		
		return constructHouse(b, c);
	}
	
	
}

class Construct{
	int time;
	int money;
	public Construct(int time, int money) {
		super();
		this.time = time;
		this.money = money;
	}
	@Override
	public String toString() {
		return "Construct [time=" + time + ", money=" + money + "]";
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
