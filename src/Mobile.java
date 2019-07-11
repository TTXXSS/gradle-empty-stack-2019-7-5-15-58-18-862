public class Mobile {
    private String name;
    private  String color;
    private String brand;
public  Mobile(){

}
    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }
    public void call(String message){
        System.out.println(message);
    }
    public void outputMobileInformation(String name,String color,String brand){
    System.out.println("name:"+name+" color:"+color+" brand:"+brand);
    }

    protected String getName() {
        return name;
    }

    protected String getColor() {
        return color;
    }

    protected String getBrand() {
        return brand;
    }
}
