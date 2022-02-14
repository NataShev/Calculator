public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUM);
        double result = formula.result;
        int sum = (int) Math.round(result);
        return sum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT);
        double result = formula.result;
        int mult = (int) Math.round(result);
        return mult;
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW);
        double result = formula.result;
        int pow = (int) Math.round(result);
        return pow;
    }
}
