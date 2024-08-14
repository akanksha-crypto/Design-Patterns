package decorator;

public class Margherita implements Pizza{
    @Override
    public Double getcost() {
        return 200.0;
    }

    @Override
    public String getdescription() {
        return "Margherita";
    }
}
