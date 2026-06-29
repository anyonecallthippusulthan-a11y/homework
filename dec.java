// Pizza Interface
interface Pizza {
    String getDescription();
    double getCost();
}

// Plain Pizza
class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 120.0;
    }
}

// Abstract Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

// Cheese Decorator
class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}

// Mushroom Decorator
class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 25.0;
    }
}

// Olive Decorator
class Olive extends PizzaDecorator {

    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20.0;
    }
}

// Main Class
class DecoratorDemo {

    public static void main(String[] args) {

        Pizza pizza1 = new PlainPizza();

        Pizza pizza2 = new Cheese(new PlainPizza());

        Pizza pizza3 = new Mushroom(
                            new Cheese(
                                new PlainPizza()));

        Pizza pizza4 = new Olive(
                            new Mushroom(
                                new Cheese(
                                    new PlainPizza())));

        display(pizza1);
        display(pizza2);
        display(pizza3);
        display(pizza4);
    }

    public static void display(Pizza pizza) {
        System.out.println("Description : " + pizza.getDescription());
        System.out.println("Cost        : " + pizza.getCost());
        System.out.println();
    }
}