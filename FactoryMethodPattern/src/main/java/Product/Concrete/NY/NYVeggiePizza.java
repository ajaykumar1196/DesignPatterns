package Product.Concrete.NY;

import Product.Pizza;

import java.util.List;

public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        super("Veggie Pizza", "Thick Crust", "Veggie Sauce", List.of("Normal Cheese"));
    }
}
