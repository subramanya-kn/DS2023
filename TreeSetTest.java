package com.dassault;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		//ctrl+shift+M
		TreeSet numberSet = new TreeSet();
		
		numberSet.add(50);
		numberSet.add(60);
		numberSet.add(55);
		numberSet.add(40);
		numberSet.add(35);
		numberSet.add(70);
		numberSet.add(45);
		
		
		Iterator numIter = numberSet.iterator();
		
		while(numIter.hasNext()) {
			int intValue = (Integer) numIter.next();
			System.out.println("num : "+intValue);
		}
		
		System.out.println("-----------");
		
		TreeSet chemicalElementSet = new TreeSet();
		
		chemicalElementSet.add("Oxygen");
		chemicalElementSet.add("Hydrogen");
		chemicalElementSet.add("Lithium");
		chemicalElementSet.add("Silver");
		chemicalElementSet.add("Gold");
		chemicalElementSet.add("Aluminium");
		chemicalElementSet.add("Helium");
		
		
		Iterator chemicalElementIter = chemicalElementSet.iterator();
		
		while(chemicalElementIter.hasNext()) {
			String strValue = (String) chemicalElementIter.next();
			System.out.println("Chemical : "+strValue);
		}
	}
}
/*		50 60 55 40 35 70 45
 * 
 * 						50 <-- root
 * 						|
 * 					--------------
 * 					|L			|R
 * 					40			60
 * 					|			|
 				---------	----------
 				|L		|R	|L		|R
 				35		45	55		70
 
 */
