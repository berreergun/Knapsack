package algo_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class algo {

	public static void main(String[] args) throws FileNotFoundException {

		int itemsCounter = 0;
		Scanner scan = new Scanner(new File("C:\\Users\\MONSTER\\Downloads\\sample1d.dat")); //C:\\Users\\MONSTER\\Downloads\\sample1b.dat

		int n = scan.nextInt();
		double capacity = scan.nextInt();

		items items[] = new items[n+1];

		while (scan.hasNextLine()) {
			int number = scan.nextInt();
			int weight = scan.nextInt();

			items[itemsCounter] = new items(number, weight, itemsCounter + 1);

			itemsCounter++;

		}

		/*for (int i = 0; i < n; i++) {
			items[i].print();

		}*/

		sortAr(items);
		
		System.out.println("dataset 1d");
		System.out.println("--------------After sort------------");

		/*for (int i = 0; i < n; i++) {
			items[i].print();

		}*/
		
		int totalValue=0;
		
		for (int i = 0; i < n; i++) {
			
			if(capacity>=items[i].weight){
				capacity=capacity-items[i].weight;
				items[i].used=true;
				totalValue+=items[i].value;
			}
			

		}
		
		
	/*	System.out.println("--------------After sort used------------");
		for (int i = 0; i < n; i++) {
			items[i].print();

		}*/
		
		
		sortArId(items);
		System.out.println("Total Value : "+ totalValue);
		for (int i = 0; i < n; i++) {
			if(items[i].used){
				System.out.println("1");
			}
			else 
				System.out.println("0");
		}

	}

	public static void sortAr(items[] it) {

		for (int i = 0; i < it.length - 1; i++) {
			for (int j = i + 1; j < it.length - 1; j++) {
				items tmp;
				if (it[i].getPerValue() < it[j].getPerValue()) {
					tmp = it[i];
					it[i] = it[j];
					it[j] = tmp;
				}
			}
		}
	}
	
	public static void sortArId(items[] it) {

		for (int i = 0; i < it.length - 1; i++) {
			for (int j = i + 1; j < it.length - 1; j++) {
				items tmp;
				if (it[i].id < it[j].id) {
					tmp = it[i];
					it[i] = it[j];
					it[j] = tmp;
				}
			}
		}
	}

}
