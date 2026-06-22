package todayhomework;

public class Studentm {

    private int id;
    private String name;
    private String email;
    private String course;
    private double fee;

    public Studentm(int id, String name, String email, String course, double fee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public double getFee() {
        return fee;
    }
}