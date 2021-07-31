import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Car {
    private Engine engine;

    public Car() {
        this.engine=new ElectricEngine();
    }

    public void start() {
        engine.turnOn();
    }
    HashMap<String,Character> hashMap=new HashMap<>();
    ArrayList a=new ArrayList(hashMap.values());
}