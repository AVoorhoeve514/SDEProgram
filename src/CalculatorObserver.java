public class CalculatorObserver implements Observer {
    @Override
    public void update(double result) {
        System.out.println("Calculator Result Updated: " + result);
    }
}