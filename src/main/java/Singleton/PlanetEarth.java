package Singleton;

public class PlanetEarth {
    private static PlanetEarth instance;

    private PlanetEarth() {

    }

    public static PlanetEarth getInstance() {
        if(instance == null) {
            instance = new PlanetEarth();
        }
        return instance;
    }
}
