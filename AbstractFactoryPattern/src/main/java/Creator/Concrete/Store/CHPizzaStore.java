package Creator.Concrete.Store;

import Creator.Concrete.IngredientFactory.CHPizzaIngredientFactory;
import Creator.PizzaIngredientFactory;
import Creator.PizzaStore;
import Product.Concrete.Pizza.CheesePizza;
import Product.Concrete.Pizza.VeggiePizza;
import Product.Pizza;
import Product.PizzaType;

public class CHPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new CHPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                break;
        }
        return pizza;
    }
}
