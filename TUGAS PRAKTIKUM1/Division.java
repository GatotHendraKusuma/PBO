public class Division implements Operation {
    public double calculateResult(double left, double right) {
        if ( right == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return left / right;
    }
}