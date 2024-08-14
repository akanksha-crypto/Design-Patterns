package decorator;

public class Cheese extends Toppings{

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double getcost() {
        return pizza.getcost() + 80.0;
    }

    @Override
    public String getdescription() {
        return pizza.getdescription() + " + Cheese";
    }
}
