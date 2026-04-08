package transport;

public class city extends hi {
      

    city(int id, String name, String to, double distance) {
        super(id, name, to, distance);
    }

    void calculateFare() {
        fare = distance * 5;
    }
}
    
}
