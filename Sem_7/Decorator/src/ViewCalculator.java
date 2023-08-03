

import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int primaryArg1 = promptInt("Введите первое число первого комплексного числоа формата a + bi : ");
            int primaryArg2 = promptInt("Введите второе число первого комплексного числоа формата a + bi : ");
            int primaryArg3 = promptInt("Введите первое число второго комплексного числоа формата a + bi : ");
            int primaryArg4 = promptInt("Введите второе число второго комплексного числоа формата a + bi : ");
            Calculator calculator1 = new Calculator(primaryArg1, primaryArg2);
            Calculator calculator2 = new Calculator(primaryArg3, primaryArg4);
            
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =) : ");
                if (cmd.equals("*")) {
                    System.out.print("(" + primaryArg1 + " + " + primaryArg2 + "i" + ")" + " * " + "(" + primaryArg3 + " + " + primaryArg4 + "i" + ")" + " = ");
                    calculator1.multi(calculator2);
                    continue;
                }
                if (cmd.equals("+")) {
                    System.out.print("(" + primaryArg1 + " + " + primaryArg2 + "i" + ")" + " + " + "(" + primaryArg3 + " + " + primaryArg4 + "i" + ")" + " = ");
                    calculator1.sum(calculator2);
                    continue;
                }
                if (cmd.equals("/")) {
                    System.out.print("(" + primaryArg1 + " + " + primaryArg2 + "i" + ")" + " / " + "(" + primaryArg3 + " + " + primaryArg4 + "i" + ")" + " = ");
                    calculator1.divide(calculator2);
                    break;
                }
                // if (cmd.equals("=")) {
                //     System.out.printf("Результат %d\n", calculator1.getResult(primaryArg1, primaryArg2));
                //     break;
                // }
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