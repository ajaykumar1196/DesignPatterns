package Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauces...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }

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
