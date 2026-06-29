/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkses;

/**
 *
 * @author Lenovo
 */
class Earbuds extends PhoneDecorator {

    public Earbuds(Phone phone) {
        super(phone);
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + ", Earbuds";
    }

    @Override
    public int getPrice() {
        return phone.getPrice() + 3000;
    }
}