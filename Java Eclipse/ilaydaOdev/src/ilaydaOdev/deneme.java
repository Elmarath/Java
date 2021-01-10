package ilaydaOdev;

import java.util.Scanner;  

public class deneme {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("isim:");
		String isim = sc.nextLine();
		
		if (isim == "ilayda") {
			System.out.println("Hos geldin ilayda");
		}
		
		sc.close();
	}
}
