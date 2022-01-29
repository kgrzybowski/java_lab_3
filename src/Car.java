public class Car extends name{
    protected double price;

    public Car(String Name, String invate, double price){
        super(Name, invate);
        this.price = price;
    }
    @Override
    public String toString(){
        return "Name[" +
                super.toString()+
                ", price: " +price+
                ']';
    }
}