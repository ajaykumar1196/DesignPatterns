package Product.Concrete.CH;

import Product.Pizza;

import java.util.List;

public class CHVeggiePizza extends Pizza {
    public CHVeggiePizza() {
        super("Veggie Pizza", "Thick Crust", "Veggie Sauce", List.of("Normal Cheese"));
    }
}
