public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("phone","white","huawei");
        mobile.call("Message : [your input message]");
        Iphone iphone = new Iphone();
        iphone.call("<iPhone>Message : [your input message]");
        Android android = new Android();
        android.call("<Andriod>Message : [your input message]");
        //mobile.outputMobileInformation();
        mobile.outputMobileInformation(mobile.getName(),mobile.getColor(),
                mobile.getBrand());
        String message = "this string is for iphone";
       // System.out.println(message.length());
        IphoneRobot rootRobot = new IphoneRobot();
        rootRobot.useOnlyIphone(message,iphone);
        rootRobot.useOnlyIphone(message+"!!",android);
        Person person = new Person(android);
        Person person1 = new Person(iphone);
        person.useAndroidAndIphone(message,person.getPhone());
        person.useAndroidAndIphone(message,person1.getPhone());


    }
}
