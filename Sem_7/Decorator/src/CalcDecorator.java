public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;

    private int primaryArg1;
    private int primaryArg2;
    Calculator calculator1 = new Calculator(primaryArg1, primaryArg2);
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(Calculator calculator) {
       logger.log(String.format("Первые значения калькулятора %d %d. Начало вызова метода sum с параметрами %d %d", primaryArg1, primaryArg2));
       iCalculable result = oldCalc.sum(calculator1);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalculable multi(Calculator calculator) {
        logger.log(String.format("Первые значения калькулятора %d %d. Начало вызова метода multi с параметрами %d %d", primaryArg1, primaryArg2));
        iCalculable result = oldCalc.multi(calculator1);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public iCalculable divide(Calculator calculator) {
        logger.log(String.format("Первые значения калькулятора %d %d. Начало вызова метода divide с параметрами %d %d", primaryArg1, primaryArg2));
        iCalculable result = oldCalc.divide(calculator1);
        logger.log(String.format("Вызова метода divide произошел"));
        return result;
    }
}