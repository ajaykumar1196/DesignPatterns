package decorator;

import domain.Coffee;

public class Mocha extends CoffeeDecorator {

    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " Mocha";
    }

    @Override
    public Double getCost() {
        return this.coffee.getCost() + 0.20;
    }
}
