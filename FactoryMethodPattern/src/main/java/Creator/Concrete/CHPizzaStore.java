package Creator.Concrete;

import Creator.PizzaStore;
import Product.*;
import Product.Concrete.CH.CHCheesePizza;
import Product.Concrete.CH.CHClamPizza;
import Product.Concrete.CH.CHVeggiePizza;

public class CHPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case CHEESE:
                pizza = new CHCheesePizza();
                break;
            case CLAM:
                pizza = new CHClamPizza();
                break;
            case VEGGIE:
                pizza = new CHVeggiePizza();
                break;
        }
        return pizza;
    }
}
