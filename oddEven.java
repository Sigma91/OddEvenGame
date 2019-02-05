package main;

import java.util.Random;
import java.util.Scanner;

public class oddEven {
	//Par - nepar
	public static void oddOrEven() {
		
		String e = "E";
		String e1 = "e";
		String o = "O";
		String o1 = "o";
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name? ");
		String player = input.nextLine();
		System.out.print("Hi "+ player + "," + "which do you chose? + (O)dds or (E)vens ");
		String chose = input.nextLine();
		
		if(chose.equals(e)) {
			
			System.out.println(player + " has picked evens! The computer will be odds.");
						
		} else if(chose.equals(e1)) {
			System.out.println(player + " has picked evens! The computer will be odds.");
		} else if(chose.equals(o)) {
			System.out.println(player + " has picked odds! The computer will be evens.");
		} else if(chose.equals(o1)) {
			System.out.println(player + " has picked odds! The computer will be evens.");
		} else {
			System.err.println("Pogresan unos! Probajte ponovo.");
		}
		
		System.out.println("How many " + "\"fingers\"" + " do you put out? "); //"\"fingers\" - kod za navodnike u stringu	
		int fingers = input.nextInt();
		
		Random rand = new Random();
		int computer = rand.nextInt(10);
		System.out.println("The computer plays " + computer + " \"fingers\"" + ".");
		
		separator();
		
		int sum = fingers + computer;
		System.out.println(fingers + " + " + computer + " = " + sum);
			
		boolean oddOrEven = sum % 2 == 0;	
		if (oddOrEven == true) {
			
			System.out.println(sum + ".... is even!");
		}else {
			System.out.println(sum + ".... is odd!");
		}
			
				
		if((sum % 2 == 0) && (chose.equals(e))){
			System.out.println(player + " wins :)");
		} else if ((sum % 2 == 0) && (chose.equals(e1))) {	
			System.out.println(player + " wins :)");
		} else if ((sum % 2 != 0) && (chose.equals(o))) {
			System.out.println(player + " wins :)");
		}else if ((sum % 2 != 0) && (chose.equals(o1))) {
			System.out.println(player + " wins :)");
		}else if ((sum % 2 == 0) && (chose.equals(o))) {
			System.out.println("Computer wins :(");
		}else if ((sum % 2 == 0) && (chose.equals(o1))) {
			System.out.println("Computer wins :(");
		}else if ((sum % 2 != 0) && (chose.equals(e))) {
			System.out.println("Computer wins :(");
		}else if ((sum % 2 != 0) && (chose.equals(e1))) {
			System.out.println("Computer wins :(");
		}
		input.close();		
		separator();
	}
	//Separator
	public static void separator () {
		System.out.println("--------------------------------------");
		
	}
	
	

	public static void main(String[] args) {
		String name = "Odds and evens";
		System.out.println("Lets play a game called " + name);
		
		oddOrEven();
			
		
	}

}
