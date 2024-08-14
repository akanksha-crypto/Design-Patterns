package decorator;

public class Client {

    public static void main(String[] args) {
        demodecorator();
    }

    private static void demodecorator() {

        // Select base
        Pizza pizza = new BBQChicken();

        // Select toppings

        pizza = new Tomato(pizza);
        pizza = new Cheese(pizza);
        pizza = new Paneer(pizza);

        System.out.println(pizza.getcost());
        System.out.println(pizza.getdescription());
    }
}
