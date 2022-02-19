package Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    public Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Started baking...");
    }

    public void cut() {
        System.out.println("Cutting pizza in slices...");
    }

    public void box() {
        System.out.println("Packing the pizza in official box...");
    }

    public String getName() {
        return name;
    }
}
