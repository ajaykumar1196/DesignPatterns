package Creator.Concrete.IngredientFactory;

import Creator.PizzaIngredientFactory;
import Product.Concrete.Ingredient.MarinaraSauce;
import Product.Concrete.Ingredient.ThickCrustDough;
import Product.Concrete.Ingredient.ThinCrustDough;
import Product.Concrete.Ingredient.TomatoSauce;
import Product.Dough;
import Product.Sauce;

public class CHPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
