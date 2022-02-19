package Product.Concrete.Pizza;

import Creator.PizzaIngredientFactory;
import Product.Pizza;

public class CheesePizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("Cheese Pizza");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        System.out.println("Preparing " + this.getName() + " with " + this.dough + " and sauce " + this.sauce);
    }
}
