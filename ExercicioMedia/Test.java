package ExercicioMedia;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student t = new Student();
		
		System.out.println("Type first trimester note: ");
		double first = sc.nextDouble();
		t.setFirsttrimester(first);
		
		System.out.println("Type first trimester note: ");
		double second = sc.nextDouble();
		t.setSecondtrimester(second);
		
		System.out.println("Type first trimester note: ");
		double third = sc.nextDouble();
		t.setThirdtrimester(third);
		
		
		t.showResults();
		
		sc.close();
	}

}
