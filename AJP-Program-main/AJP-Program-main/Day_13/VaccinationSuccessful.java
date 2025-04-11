package oops;

// class implements the abstract class

public class VaccinationSuccessful extends Vaccine {

	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);		//Intializing Instance variables of super class with constructor
	}

	void boosterDose() {
			System.out.println("Boosted Dose Successful");// Implenting the abstarct method
		
	}

}
