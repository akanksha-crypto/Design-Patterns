package decorator;

public class BBQChicken implements Pizza{
    @Override
    public Double getcost() {
        return 200.0;
    }

    @Override
    public String getdescription() {
        return "BBQChicken";
    }
}
