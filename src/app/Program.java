package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		People people;

		System.out.println("Digites os nomes e generos separados por hífen:");
		String names = sc.nextLine();
		String[] freeNames = names.split(", ");

		List<People> mans = new ArrayList<>();
		List<People> women = new ArrayList<>();

		for (String s : freeNames) {
			String[] parts = s.split(" - ");
			String name = parts[0];
			char gender = parts[1].charAt(0);
			people = new People(name, gender);
			if (gender == 'M') {
				mans.add(people);
			} else {
				women.add(people);
			}
		}

		System.out.println();
		System.out.println("--- HOMENS ---");
		Collections.sort(mans);
		for (People p : mans) {
			System.out.println(p);
		}

		System.out.println();
		System.out.println("--- MULHERES ---");
		Collections.sort(women);
		for (People p : women) {
			System.out.println(p);
		}

		sc.close();

	}

}
