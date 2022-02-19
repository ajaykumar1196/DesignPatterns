package Product.Concrete.Ingredient;

import Product.Dough;

public class ThinCrustDough implements Dough {

    @Override
    public String toString() {
        return ThinCrustDough.class.getSimpleName();
    }
}
