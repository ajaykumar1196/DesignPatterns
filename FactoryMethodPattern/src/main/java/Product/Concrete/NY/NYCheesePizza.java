package Product.Concrete.NY;

import Product.Pizza;

import java.util.List;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        super("Cheese Pizza", "Thin Crust", "Marinara Sauce", List.of("Grated Cheese"));
    }
}
