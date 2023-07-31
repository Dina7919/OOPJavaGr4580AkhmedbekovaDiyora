package DIP;

public class Car {
    private Engines engine;
    public Car(Engines engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}