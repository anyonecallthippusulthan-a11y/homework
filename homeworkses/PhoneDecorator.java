/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkses;

/**
 *
 * @author Lenovo
 */
abstract class PhoneDecorator implements Phone {
    protected Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return phone.getDescription();
    }

    public int getPrice() {
        return phone.getPrice();
    }
}
