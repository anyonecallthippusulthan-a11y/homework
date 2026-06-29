package homeworkses;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */

    
class WirelessCharger extends PhoneDecorator {

    public WirelessCharger(Phone phone) {
        super(phone);
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + ", Wireless Charger";
    }

    @Override
    public int getPrice() {
        return phone.getPrice() + 2500;
    }
}
