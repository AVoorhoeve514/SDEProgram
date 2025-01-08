public class CalculatorSingleton {
    private static CalculatorSingleton instance;
    private double result;

    private CalculatorSingleton() {
        result = 0;
    }

    public static CalculatorSingleton getInstance() {
        if (instance == null) {
            instance = new CalculatorSingleton();
        }
        return instance;
    }

    public void add(double value) {
        result += value;
    }

    public void subtract(double value) {
        result -= value;
    }

    public double getResult() {
        return result;
    }
}