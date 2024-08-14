package decorator;

public class Paneer extends Toppings{

    public Paneer(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double getcost() {
        return pizza.getcost() + 60.0;
    }

    @Override
    public String getdescription() {
        return pizza.getdescription() + " + Paneer";
    }
}
