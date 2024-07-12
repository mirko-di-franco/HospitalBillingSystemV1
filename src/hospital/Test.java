package hospital;

public class Test {

	public static void main(String[] args) {

		InsuranceBrand insuranceBrand = new InsuranceBrand(1, "EHIC");

		// Create different health insurance plans
		HealthInsurancePlan platinumPlan = new PlatinumPlan();
		HealthInsurancePlan goldPlan = new GoldPlan();
		HealthInsurancePlan silverPlan = new SilverPlan();
		HealthInsurancePlan bronzePlan = new BronzePlan();

		// Create patients with different insurance plans
		Patient patient1 = new Patient(1, "Mario", "Rossi", "M", "mario.rossi@example.com", 101, true, platinumPlan);
		Patient patient2 = new Patient(2, "Luca", "Bianchi", "M", "luca.bianchi@example.com", 102, true, goldPlan);
		Patient patient3 = new Patient(3, "Anna", "Verdi", "F", "anna.verdi@example.com", 103, true, silverPlan);
		Patient patient4 = new Patient(4, "Elena", "Neri", "F", "elena.neri@example.com", 104, true, bronzePlan);
		Patient patient5 = new Patient(5, "Giorgio", "Gialli", "M", "giorgio.gialli@example.com", 105, false, null);

		// Treatment cost
		double amount = 1000.0;

		// Calculate payment amounts for different patients
		printPaymentDetails(patient1, amount);
		printPaymentDetails(patient2, amount);
		printPaymentDetails(patient3, amount);
		printPaymentDetails(patient4, amount);
		printPaymentDetails(patient5, amount);

	}

	
	// Method to print payment details for a given patient and amount
	private static void printPaymentDetails(Patient patient, double amount) {
		double[] payments = Billing.computePaymentAmount(patient, amount);
		System.out.println("Patient: " + patient.getFirstName() + " " + patient.getLastName());
		System.out.println("Payment by insurance: " + payments[0]);
		System.out.println("Payment by patient: " + payments[1]);
		System.out.println("-------------------------------------------------");
	}

}
