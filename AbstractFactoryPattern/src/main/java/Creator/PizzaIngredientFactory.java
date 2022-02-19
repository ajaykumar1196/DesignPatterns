package Creator;

import Product.Dough;
import Product.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
}
