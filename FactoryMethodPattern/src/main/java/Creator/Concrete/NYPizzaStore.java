package Creator.Concrete;

import Creator.PizzaStore;
import Product.*;
import Product.Concrete.NY.NYCheesePizza;
import Product.Concrete.NY.NYClamPizza;
import Product.Concrete.NY.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case CHEESE:
                pizza = new NYCheesePizza();
                break;
            case CLAM:
                pizza = new NYClamPizza();
                break;
            case VEGGIE:
                pizza = new NYVeggiePizza();
                break;
        }
        return pizza;
    }
}
