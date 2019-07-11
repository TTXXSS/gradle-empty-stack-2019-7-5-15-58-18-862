public class IphoneRobot {
public void useOnlyIphone(String message,Mobile mobile){
if(mobile instanceof Iphone)
    mobile.call(message);
else
    System.out.println("rootrobot can only use iphone,this string is not for iphone");
}
}
