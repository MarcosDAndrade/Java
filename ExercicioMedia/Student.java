package ExercicioMedia;

public class Student {
	private String name;
	private double  firsttrimester;
	private double secondtrimester;
	private double thirdtrimester;
	
	public Student() {
		
	}
	public Student(String name, double firsttrimester, double secondtrimester, double thirdtrimester) {
		this.name = name;
		this.firsttrimester = firsttrimester;
		this.secondtrimester = secondtrimester;
		this.thirdtrimester = thirdtrimester;
	}
	
	public void showResults() {
		double total = firsttrimester + secondtrimester + thirdtrimester;
		double media = 60.0;
		if (total >= media) {
			System.out.println("FINAL GRADE: " + total + "\n PASS");			
		} else {
			System.out.println("FINAL GRADE: " + total + "\n FAILED");
			double missing = media-total;
			System.out.println("MISSING: " + missing + " POINTS");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFirsttrimester() {
		return firsttrimester;
	}
	public void setFirsttrimester(double firsttrimester) {
		this.firsttrimester = firsttrimester;
	}
	public double getSecondtrimester() {
		return secondtrimester;
	}
	public void setSecondtrimester(double secondtrimester) {
		this.secondtrimester = secondtrimester;
	}
	public double getThirdtrimester() {
		return thirdtrimester;
	}
	public void setThirdtrimester(double thirdtrimester) {
		this.thirdtrimester = thirdtrimester;
	}
	
	
	
	
 

}
