package Product.Concrete.NY;

import Product.Pizza;

import java.util.List;

public class NYClamPizza extends Pizza {
    public NYClamPizza() {
        super("Clam Pizza", "Thick Crust", "Clam Sauce", List.of("Normal Cheese"));
    }
}
