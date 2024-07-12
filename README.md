# Hospital Billing System
The Hospital Billing System is designed to manage billing for patients based on their health insurance plans. This Java program calculates payment amounts for patients, considering different insurance coverage levels and treatment costs.

## Code Structure
The program is structured as follows:

1. **HealthInsurancePlan Class**:

    - Represents a generic health insurance plan.
    - Attributes include the insurance brand and coverage percentage.
    - Provides methods to get and set these attributes.

2. **Billing Class**:

    - Contains a static method **`computePaymentAmount`**:
    - Calculates payment amounts for a patient based on their insurance plan and treatment cost.
    - Returns an array of two doubles: payment covered by insurance and payment due from the patient.

3. **User Class**:

    - Represents a generic user with attributes such as id, first name, last name, gender, and email.
    - Provides methods to get and set these attributes.

4. **Patient Class** (extends User):

    - Inherits from **`User`**.
    - Additional attributes include patient ID, insured status, and associated health insurance plan.
    - Provides methods to get and set these attributes.

5. **Health Insurance Plan Subclasses**:

    - **`PlatinumPlan`**, **`GoldPlan`**, **`SilverPlan`**, **`BronzePlan`**:
    - Subclasses of **`HealthInsurancePlan`** with specific coverage percentages.

6. **InsuranceBrand Class**:

    - Represents an insurance brand providing health insurance plans.
    - Attributes include ID and name of the insurance company.
    - Provides methods to get and set these attributes.


## Usage Example  [Navigate to the file](src/hospital/Test.java)
```
public class Main {
    public static void main(String[] args) {

        HealthInsurancePlan platinumPlan = new PlatinumPlan();

        Patient patient1 = new Patient(1, "Mario", "Rossi", "M", "mario.rossi@example.com", 101, true, platinumPlan);
        Patient patient5 = new Patient(5, "Giorgio", "Gialli", "M", "giorgio.gialli@example.com", 105, false, null);

        double amount = 1000.0;

        printPaymentDetails(patient1, amount);
        printPaymentDetails(patient5, amount);
    }
}
```
## Output
```
Patient: Mario Rossi
Payment by insurance: 900.0
Payment by patient: 50.0
-------------------------------------------------
Patient: Giorgio Gialli
Payment by insurance: 0.0
Payment by patient: 980.0
-------------------------------------------------
```
