/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmain;

/**
 *
 * @author Lenovo
 */
public class Studentmodule {
    private int id;
    private String name;
    private String course;
    private String email;
    private float fees;

    public Studentmodule(int id, String name, String course, String email, float fees) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.email = email;
        this.fees = fees;
    }

    public Studentmodule() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
    
            
    
}
