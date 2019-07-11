public class Android extends Mobile {
    @Override
    public void call(String message) {
        if (message.length() > 25)
            System.out.println("<Android> Message cannot be sent");
        else
            System.out.println(message);
    }
}
