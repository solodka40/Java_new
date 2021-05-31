package Task4;

public class Candy extends SetPresent {
    private String size;
    public Candy (){}

    public Candy(String name, double price, double weight, String size) {
        super(name, price, weight);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy{" +super.toString()+
                " ,size='" + size + '\'' +
                '}';
    }
}
