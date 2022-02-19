import Creator.Concrete.CHPizzaStore;
import Creator.Concrete.NYPizzaStore;
import Product.Pizza;
import Product.PizzaType;

public class FactoryMethodPatterDemo {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        CHPizzaStore chPizzaStore = new CHPizzaStore();

        Pizza myNYPizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("I ordered " + myNYPizza.getName() + "\n");

        Pizza myCHPizza = chPizzaStore.orderPizza(PizzaType.CLAM);
        System.out.println("I ordered " + myCHPizza.getName() + "\n");
    }
}
