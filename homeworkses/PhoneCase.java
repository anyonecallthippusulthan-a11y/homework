
package homeworkses;

class PhoneCase extends PhoneDecorator {

    public PhoneCase(Phone phone) {
        super(phone);
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + ", Phone Case";
    }

    @Override
    public int getPrice() {
        return phone.getPrice() + 1000;
    }
}
    
    