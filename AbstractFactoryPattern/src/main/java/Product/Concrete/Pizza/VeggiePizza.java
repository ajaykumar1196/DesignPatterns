package Product.Concrete.Pizza;

import Creator.PizzaIngredientFactory;
import Product.Pizza;

public class VeggiePizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("Veggie Pizza");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        System.out.println("Preparing " + this.getName() + " with " + this.dough + " and sauce " + this.sauce);
    }
}
