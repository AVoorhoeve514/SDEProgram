public class Calculator {

    private double result;

    public Calculator() {
        this.result = 0;
    }

    public void add(double number) {
        result += number;
    }

    public void subtract(double number) {
        result -= number;
    }

    public double getResult() {
        return result;
    }

    public void performCalculation() {
        // This method might hold some logic for performing a calculation.
        // Currently, it's just a placeholder to represent the concept.
        System.out.println("Performing calculation...");
    }
}