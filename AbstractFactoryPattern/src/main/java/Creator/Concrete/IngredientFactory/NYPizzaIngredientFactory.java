package Creator.Concrete.IngredientFactory;

import Creator.PizzaIngredientFactory;
import Product.Concrete.Ingredient.ThickCrustDough;
import Product.Concrete.Ingredient.TomatoSauce;
import Product.Dough;
import Product.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
