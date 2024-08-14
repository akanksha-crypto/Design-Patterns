package decorator;

public class Farmhouse implements Pizza{

    @Override
    public Double getcost() {
        return 150.0;
    }

    @Override
    public String getdescription() {
        return "Farmhouse";
    }
}
