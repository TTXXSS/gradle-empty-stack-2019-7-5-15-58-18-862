public class Person {
    private Mobile phone;

    public Person(Mobile phone) {
        this.phone = phone;
    }

    public void useAndroidAndIphone(String message, Mobile mobile) {

            mobile.call(message);

    }

    public Mobile getPhone() {
        return phone;
    }
}
