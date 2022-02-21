package decorator;

import domain.Coffee;

public class Whip extends CoffeeDecorator {

    public Whip(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " Whip";
    }

    @Override
    public Double getCost() {
        return this.coffee.getCost() + 0.30;
    }
}
