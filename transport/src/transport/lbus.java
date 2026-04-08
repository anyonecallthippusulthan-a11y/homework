package transport;

public class lbus extends hi {
     

    lbus(int id, String name, String to, double distance) {
        super(id, name, to, distance);
    }

    void calculateFare() {
        fare = (distance * 10) + 200;
    }
}
    
}
