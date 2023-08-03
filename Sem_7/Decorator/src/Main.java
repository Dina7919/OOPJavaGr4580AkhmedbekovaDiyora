

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        iCalculable calculator1 = new Calculator(2,3);
        iCalculable calculator2 = new Calculator(3,4);

        iCalculable newCalcLog1 = new CalcDecorator(calculator1, new Logger());
        iCalculable newCalcLog2 = new CalcDecorator(calculator2, new Logger());
        
        ViewCalculator view1 = new ViewCalculator(newCalcLog1);
        ViewCalculator view2 = new ViewCalculator(newCalcLog2);
        view1.run();
        view2.run();
    }
}
