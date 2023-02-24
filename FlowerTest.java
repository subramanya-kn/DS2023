package com.dassault;

import java.util.Scanner;

public class FlowerTest {

	public static void main(String[] args) {
	
	//	Fragrancing frag = new Fragrancing();
	//	Flower flower = new Flower();
		
	//	Rose rose = new Rose();
	//	rose.flowering();
	//	rose.whatIstheFragrance();
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Which flower u want ? ");
		String theHint = scan.nextLine();
		
		AnyGarden anyGarden = new AnyGarden();
		Flower flower = anyGarden.getFlower(theHint);
		flower.flowering();
		flower.whatIstheFragrance();
		
	}

}

class AnyGarden
{
	
	Flower getFlower(String hint){ 
		
		Flower flower = null;
		
		if(hint.equals("valentine")) {
			flower = new Rose();
		}
		else if(hint.equals("diwali")) {
			flower = new Lotus();
		}
		else if(hint.equals("oil")) {
			flower = new SunFlower();
		}
		else if(hint.equals("arab")) {
			flower = new ArabianRose();
		}
		return flower;
	}
}
/*
class RoseGarden extends AnyGarden
{
	Rose getFlower() {
		Rose rose = new Rose();
		return rose;
	}
}
*/



interface Fragrancing
{
	void whatIstheFragrance();
	
}
abstract class Flower implements Fragrancing
{
	abstract void flowering();
}

class Rose extends Flower
{
	public void whatIstheFragrance() {
		System.out.println("It is a rose smell....");
	}
	void flowering() {
		System.out.println("Rose is flowering...");
	}
}



class ArabianRose extends Rose
{
	public void whatIstheFragrance() {
		System.out.println("It is a ArabianRose smell....");
	}
	void flowering() {
		System.out.println("ArabianRose is flowering...");
	}
}


class Lotus extends Flower
{
	public void whatIstheFragrance() {
		System.out.println("It is a lotus smell....");
	}
	void flowering() {
		System.out.println("Lotus is flowering...in the water..");
	}
}

class SunFlower extends Flower
{
	public void whatIstheFragrance() {
		System.out.println("It is a SunFlower smell....");
	}
	void flowering() {
		System.out.println("SunFlower is flowering...in the Sun");
	}
}













