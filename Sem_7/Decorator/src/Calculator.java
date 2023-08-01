public final class Calculator implements iCalculable {

    private int primaryArg1;
    private int primaryArg2;
    private int newNum1;
    private int newNum2;
    Calculator newCalculator;

    public Calculator(int primaryArg1, int primaryArg2) {
        this.primaryArg1 = primaryArg1;
        this.primaryArg2 = primaryArg2;
    }
    public int getPrimaryArg1(){
        return primaryArg1;
    }

    public int getPrimaryArg2(){
    return primaryArg2;
    }

    @Override
    public iCalculable sum(Calculator calculator) {
        newNum1 = primaryArg1 + calculator.getPrimaryArg1();
        newNum2 = primaryArg2 + calculator.getPrimaryArg2();
        return newCalculator = new Calculator(newNum1, newNum2);
    }

    @Override
    public iCalculable multi(Calculator calculator) {
        newNum1 = (primaryArg1 * calculator.getPrimaryArg1()) - (primaryArg2 * calculator.getPrimaryArg2());
        newNum2 = (primaryArg2 * calculator.getPrimaryArg1()) - (primaryArg1 * calculator.getPrimaryArg2());
        return newCalculator = new Calculator(newNum1, newNum2);
    }

    @Override
    public iCalculable divide(Calculator calculator) {
        newNum1 = (primaryArg1 * calculator.getPrimaryArg1() + primaryArg2 * calculator.getPrimaryArg2())/(calculator.getPrimaryArg1() * calculator.getPrimaryArg1()) + (calculator.getPrimaryArg2() * calculator.getPrimaryArg2());
        newNum2 = (primaryArg2 * calculator.getPrimaryArg1() - primaryArg1 * calculator.getPrimaryArg2())/(calculator.getPrimaryArg1() * calculator.getPrimaryArg1()) + (calculator.getPrimaryArg2() * calculator.getPrimaryArg2());
        return newCalculator = new Calculator(newNum1, newNum2);
    }

    @Override
    public int getResult() {
        return newCalculator;
    }
    @Override
    public void sum(int primaryArg1, int primaryArg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }
    @Override
    public void multi(int primaryArg1, int primaryArg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multi'");
    }
    @Override
    public void divide(int primaryArg1, int primaryArg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }
}