public class Iphone extends Mobile {
    @Override
    public void call(String message) {
        if(message.length()<=25)
            System.out.println("<iPhone> Message cannot be sent");
        else
            System.out.println(message);
    }
}
