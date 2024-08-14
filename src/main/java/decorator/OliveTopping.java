package decorator;

public class OliveTopping extends Toppings{

    public OliveTopping(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double getcost() {
        return pizza.getcost() + 20.0;
    }

    @Override
    public String getdescription() {
        return pizza.getdescription() + ", olive";
    }
}
