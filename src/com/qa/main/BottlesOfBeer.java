package com.qa.main;

public class BottlesOfBeer {
	
	
	public static void counter() {
		
	
	for (int i = 99; i > 0; i--) {
		
		
		if (i == 2) {
		System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i - 1) + " bottle of beer on the wall."); 
	
		
		
		} else if (i == 1) {
		
				System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall."); 
		
			} else {
				System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall."); 
				
				
			}
		
		
		} //If no more bottle(s) are left then print
		
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.");
	}
	
}
