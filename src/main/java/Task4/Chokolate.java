package Task4;

public class Chokolate extends SetPresent {
    public String type;
    public Chokolate(String name, double price, double weight,String type) {
        super(name, price, weight);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chokolate{" +super.toString()+
                " ,type='" + type + '\'' +
                '}';
    }
}
