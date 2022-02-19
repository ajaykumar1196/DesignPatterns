package Product.Concrete.CH;

import Product.Pizza;

import java.util.List;

public class CHCheesePizza extends Pizza {
    public CHCheesePizza() {
        super("Cheese Pizza", "Thin Crust", "Marinara Sauce", List.of("Grated Cheese"));
    }
}
