import Creator.Concrete.Store.CHPizzaStore;
import Creator.Concrete.Store.NYPizzaStore;
import Creator.PizzaStore;
import Product.Pizza;
import Product.PizzaType;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chPizzaStore = new CHPizzaStore();

        Pizza myNYPizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("I ordered " + myNYPizza.getName() + "\n");

        Pizza myCHPizza = chPizzaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("I ordered " + myCHPizza.getName() + "\n");
    }
}
