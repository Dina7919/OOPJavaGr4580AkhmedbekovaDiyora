

import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int primaryArg1 = promptInt("Введите первое комплексное число формата a+bi: ");
            int primaryArg2 = promptInt("Введите второе комплексное число формата a+bi: ");
            calculator.sum(primaryArg1, primaryArg2);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =) : ");
                if (cmd.equals("*")) {
                    
                    calculator.multi(primaryArg1, primaryArg2);
                    continue;
                }
                if (cmd.equals("+")) {
                    calculator.sum(primaryArg1, primaryArg2);
                    continue;
                }
                if (cmd.equals("/")) {
                    calculator.divide(primaryArg1, primaryArg2);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}