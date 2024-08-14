package decorator;

public class Pepperoni implements Pizza{
    @Override
    public Double getcost() {
        return 180.0;
    }

    @Override
    public String getdescription() {
        return "Pepperoni";
    }
}
