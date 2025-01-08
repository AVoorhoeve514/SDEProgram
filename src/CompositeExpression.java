import java.util.ArrayList;
import java.util.List;

public class CompositeExpression implements MathExpression {
    private final List<MathExpression> expressions = new ArrayList<>();

    public void addExpression(MathExpression expression) {
        expressions.add(expression);
    }

    @Override
    public double evaluate() {
        double result = 0;
        for (MathExpression expression : expressions) {
            result += expression.evaluate();
        }
        return result;
    }
}