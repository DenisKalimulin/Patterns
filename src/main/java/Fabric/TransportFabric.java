package Fabric;

public class TransportFabric {
    public Transport createTransport(String type ) {
        if(type == null || type.equals("")) {
            return null;
        }
        if(type.equalsIgnoreCase("Ship")) {
            return new Ship();
        } else if(type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if(type.equalsIgnoreCase("Plane")) {
            return new Plane();
        }
        return null;
    }
}
