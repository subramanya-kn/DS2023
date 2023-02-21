public class ConstructionOfHouse {

    public static void main(String[] args) {
        Brick brick = new Brick(2500,50,"Good","Hightensile");
        Cement cement = new Cement(25,"Excellent", 2500);
        Wall wall = new Wall();
        wall.constructHouse(brick,cement);
        System.out.println(wall);

    }

}

class Brick{
    int noOfbricks;
    int sizeOfbricks;
    String quality;
    String strength;
    public Brick(int noOfbricks, int sizeOfbricks, String quality, String strength) {
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
    public String getQuality() {
        return quality;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public String getStrength() {
        return strength;
    }
    public void setStrength(String strength) {
        this.strength = strength;
    }


}

class Cement{

    int cementQuantity;
    String cementQuality;

    int price;
    public Cement(int cementQuantity, String cementQuality, int price) {
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
    public String getCementQuality() {
        return cementQuality;
    }
    public void setCementQuality(String cementQuality) {
        this.cementQuality = cementQuality;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}

class Wall{

    Construct constructHouse(Brick b, Cement c) {
        System.out.println("Let's Construct the House");
        System.out.println("The number of bricks used in the construction is"+b.getNoOfbricks()+"and the size of the each brick is"+b.getSizeOfbricks());
        System.out.println("The quantity of cement required in construction is "+c.getCementQuantity()+"And the quality of the cement is"+c.getCementQuality());
        System.out.println("The time taken to construct the house is"+construct.getTime()+"And the money spent is"+construct.getMoney());

        return constructHouse(b, c);
    }

    Construct construct = new Construct(1,10000000);




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
