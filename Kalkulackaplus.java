package main;

import java.util.Scanner;

public class Kalkulackaplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj cislo 1");
		int cislo1 = sc.nextInt();
		System.out.println("Zadaj cislo 2");
		int cislo2 = sc.nextInt();
		
		int cislo3 = cislo1 + cislo2;
		System.out.println(cislo3);
	}

}
