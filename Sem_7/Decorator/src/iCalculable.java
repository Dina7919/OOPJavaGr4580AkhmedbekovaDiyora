
public interface iCalculable {
    iCalculable sum(Calculator calculator);
    iCalculable multi(Calculator calculator);
    iCalculable divide(Calculator calculator);
    int getResult();
    iCalculable sum(int primaryArg1, int primaryArg2);
    iCalculable multi(int primaryArg1, int primaryArg2);
    void divide(int primaryArg1, int primaryArg2);
}