public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
               double sumCount =  target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
               return  (int)sumCount;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        double multCount =  target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return  (int)multCount;

    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        double powCount =  target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return  (int)powCount;
    }
}