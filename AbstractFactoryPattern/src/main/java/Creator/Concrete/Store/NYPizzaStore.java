package Creator.Concrete.Store;

import Creator.Concrete.IngredientFactory.NYPizzaIngredientFactory;
import Creator.PizzaIngredientFactory;
import Creator.PizzaStore;
import Product.Concrete.Pizza.CheesePizza;
import Product.Concrete.Pizza.VeggiePizza;
import Product.Pizza;
import Product.PizzaType;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
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
