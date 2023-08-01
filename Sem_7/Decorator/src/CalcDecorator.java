public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(Calculator calculator) {
       int firstArg1 = oldCalc.getResult();
       int firstArg2 = oldCalc.getResult();

       logger.log(String.format("Первые значения калькулятора %d %d. Начало вызова метода sum с параметрами %d %d", firstArg1, firstArg2));
       iCalculable result = oldCalc.sum(firstArg1, firstArg2);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalculable multi(Calculator calculator) {
       int firstArg1 = oldCalc.getResult();
       int firstArg2 = oldCalc.getResult();
        logger.log(String.format("Первые значения калькулятора %d %d. Начало вызова метода multi с параметрами %d %d", firstArg1, firstArg2));
        iCalculable result = oldCalc.multi(firstArg1, firstArg2);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    @Override
    public iCalculable divide(Calculator calculator) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }

    @Override
    public iCalculable sum(int primaryArg1, int primaryArg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public iCalculable multi(int primaryArg1, int primaryArg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multi'");
    }

    @Override
    public void divide(int primaryArg1, int primaryArg2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }
    
}