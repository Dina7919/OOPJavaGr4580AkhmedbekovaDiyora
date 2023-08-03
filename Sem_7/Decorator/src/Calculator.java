import java.util.ArrayList;

public final class Calculator implements iCalculable {

    private int primaryArg1;
    private int primaryArg2;
    Calculator newCalculator;

    public Calculator(int primaryArg1, int primaryArg2) {
        this.primaryArg1 = primaryArg1;
        this.primaryArg2 = primaryArg2;
    }
    // public int getPrimaryArg1(){
    //     return primaryArg1;
    // }

    // public int getPrimaryArg2(){
    // return primaryArg2;
    // }

    @Override
    public iCalculable sum(Calculator calculator) {
        primaryArg1 += calculator.primaryArg1;
        primaryArg2 += calculator.primaryArg2;
        newCalculator = new Calculator(primaryArg1, primaryArg2);
        System.out.println(primaryArg1 + " + " + primaryArg2 + "i");
        return newCalculator;
    }

    @Override
    public iCalculable multi(Calculator calculator) {
        int num1 = primaryArg1;
        int num2 = primaryArg2;
        primaryArg1 = (num1 * calculator.primaryArg1) - (num2 * calculator.primaryArg2);
        primaryArg2 = (num1 * calculator.primaryArg2) + (num2 * calculator.primaryArg1);
        System.out.println(primaryArg1 + " * " + primaryArg2 + "i");
        return newCalculator = new Calculator(primaryArg1, primaryArg2);
    }

    @Override
    public iCalculable divide(Calculator calculator) {
        int num1 = primaryArg1;
        int num2 = primaryArg2;
        int num = (calculator.primaryArg1 * calculator.primaryArg1) + (calculator.primaryArg2 * calculator.primaryArg2);
        primaryArg1 = (num1 * calculator.primaryArg1) + (num2 * calculator.primaryArg2)/num;
        primaryArg2 = (num2 * calculator.primaryArg1) - (num1 * calculator.primaryArg2)/num;
        return newCalculator = new Calculator(primaryArg1, primaryArg2);
    }

    // @Override
    // public iCalculable getResult(int primaryArg1, int primaryArg2) {
    //     System.out.println(primaryArg1 + " + " + primaryArg2 + "i");
    //     return newCalculator;
    // }
}