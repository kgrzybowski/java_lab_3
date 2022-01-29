public class name {
    protected String Name;
    protected String invate;
    private  boolean orCar;

    public name(String Name, String invate){
        this.Name = Name;
        this.invate = invate;
        orCar = true;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInvate() {
        return invate;
    }

    public void setInvate(String invate) {
        this.invate = invate;
    }

    @Override
    public String toString(){
        return "[name: " +Name+ '\''+
                ", invate: " +invate+ '\''+
                ", orCar: " +(orCar ? "Yes" : "No")+
                ']';

    }
}