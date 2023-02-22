
class House
{
	void restOnTheBed(Sleeping x, Sleeping y) {
		System.out.println("resting on the bed....");
		//x.think();
		//x.eat();
		x.sleep();
		//y.eat();
		//y.bark();
		y.sleep();
		
	}
	
	void dining(Eating x, Eating y) {
		System.out.println("eating on the dining table....");
		//x.think();
		x.eat();
		//x.sleep();
		y.eat();
		//y.bark();
		//y.sleep();
	}
	void writingArticle(Feeling f, Thinking t)
	{
		f.feel();
		t.think();
	}
}

class Studio
{
	void letsMakeASong(Lyrics x, Music y, Singer z)
	{
		System.out.println("lets make a song .....");
		Song gotTheSong = z.sing(x, y);
		
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		
		Human human = new Human();
		Human human2 = new Human();
		Dog dog = new Dog();
		
		Studio theStudio = new Studio();
		Lyrics lyr = new Lyrics();
		Music mus = new Music();
		Singer singer = new Singer();
		
		theStudio.letsMakeASong(lyr, mus, singer);
		
		
		
		House house = new House();
		house.restOnTheBed(human, dog);
		System.out.println("---------");
		house.dining(human, dog);
			
		
		
		
	/*	Sleeping x = new Human();
		
		x.eat();
		x.sleep();
		x.fear();
		x.reProduction();
		x.think();
		x.feel();
		x.walk();
		x.giveBirth();*/
		
		
	}
}

interface Eating {
	void eat(); //by default public and abstract
}
interface Sleeping
{
	void sleep();
}
interface Fearing {
	void fear();
}
interface Reproducing {
	void reProduction();
}
/*
abstract class Eating {
	abstract void eat();
}*/

class Animal implements Eating, Sleeping, Fearing, Reproducing //isA
{
	public void eat() {
		System.out.println("Animal is eating....");
	}
	public void sleep() {
		System.out.println("Animal is sleeping...");
	}
	public void fear() {
		System.out.println("Animal is fearing...");
	}
	public void reProduction() {
		System.out.println("Animal is reproducing....");
	}
}

interface Walking {
	void walk();
}
class Mammal extends Animal implements Walking
{
	void giveBirth() {
		System.out.println("Mammal is giving birth...");
	}
	public void walk() {
		System.out.println("Mammal is walking....");
	}
}

interface Thinking
{
	void think();
}
interface Feeling extends Thinking
{
	void feel();
}
class Song {}
class Lyrics {}
class Music {}

interface Singing
{
	Song sing(Lyrics l, Music m ); //declaration
}

class Singer extends Human implements Singing
{
	public Song sing(Lyrics l, Music m) { //implementation
		
		Song theSong = new Song();
		return theSong;
	}
}
class Human extends Mammal implements  Feeling //1+2+4=7 methods in Human
{
	public void think() {
		System.out.println("Human is thinking...");
	}
	
	public void feel() {
		System.out.println("Human is feeling...");
	}
	
	//Human is overriding nearest parent's function
	public void walk() {
		System.out.println("Human is walking with style...like an actor....");
	}
	void giveBirth() {
		System.out.println("human can give birth ...with a wise decision...");
	}
	
	//Human is overriding the grand parent's function
	public void eat() {
		System.out.println("Human is eating..with an etiquette");
	}
	
	public void sleep() {
		System.out.println("Human is sleeping...at 11pm..");
	}
	public void fear() {
		System.out.println("Human is fearing...God...");
	}
	public void reProduction() {
		System.out.println("Human is reproducing...another Human....");
	}
}

interface Barking
{
	void bark();
}
interface Sniffing {
	void sniff();
}

class Dog extends Mammal implements Barking, Sniffing
{
	public void sniff() {
		System.out.println("Dog is sniffing...");
	}
	
	public void bark() {
		System.out.println("Dog is barking...");
	}

	@Override
	void giveBirth() {
		System.out.println("Dog is giving birth .....");
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking  .....");

	}

	@Override
	public void eat() {
		System.out.println("Dog is eating Bone .....");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping  mostly in day time .....");

	}

	@Override
	public void fear() {
		System.out.println("Dog is fearing from Human .....");
	}

	@Override
	public void reProduction() {
		System.out.println("Dog is reproducting another dog  .....");

	}
	
}