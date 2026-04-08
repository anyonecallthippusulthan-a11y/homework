package transport;

abstract class hi {
    int id;
    String name, from = "Chennai", to;
    double distance, fare;

    hi(int id, String name, String to, double distance) {
        this.id = id;
        this.name = name;
        this.to = to;
        this.distance = distance;
    }

    abstract void calculateFare();

    void display() {
        System.out.println("Passenger ID   : " + id);
        System.out.println("Passenger Name : " + name);
        System.out.println("Route          : " + from + " -> " + to);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : ₹" + fare);
    }
}
    }
}
