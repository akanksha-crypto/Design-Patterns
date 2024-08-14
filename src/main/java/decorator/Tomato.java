package decorator;

public class Tomato extends Toppings{

    public Tomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double getcost() {
        return pizza.getcost() + 30.0;
    }

    @Override
    public String getdescription() {
        return pizza.getdescription() + " + Tomato";
    }
}
