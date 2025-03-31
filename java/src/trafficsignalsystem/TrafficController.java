package trafficsignalsystem;

import java.util.HashMap;
import java.util.Map;

public class TrafficController {
    private static TrafficController instance;
    private final Map<String, Road> roads;

    private TrafficController() {
        roads = new HashMap<>();
    }

    public static TrafficController getInstance() {
        if (instance == null) {
            instance = new TrafficController();
        }
        return instance;
    }

    public void addRoad(Road road) {
        roads.put(road.getId(), road);
    }

    public void removeRoad(String roadId) {
        roads.remove(roadId);
    }

    public void startTrafficControl() {
        for (Road road : roads.values()) {
            TrafficLight trafficLight = road.getTrafficLight();
            new Thread(() -> {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" Red");
                        Thread.sleep(trafficLight.getRedDuration());
                        trafficLight.changeSignal(Signal.GREEN);
                        System.out.println(Thread.currentThread().getName()+" Green");
                        Thread.sleep(trafficLight.getGreenDuration());
                        trafficLight.changeSignal(Signal.YELLOW);
                        System.out.println(Thread.currentThread().getName()+" Yellow");
                        Thread.sleep(trafficLight.getYellowDuration());
                        trafficLight.changeSignal(Signal.RED);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void handleEmergency(String roadId) {
        Road road = roads.get(roadId);
        if (road != null) {
            TrafficLight trafficLight = road.getTrafficLight();
            trafficLight.changeSignal(Signal.GREEN);
            // Perform emergency handling logic
            // ...
        }
    }
}
