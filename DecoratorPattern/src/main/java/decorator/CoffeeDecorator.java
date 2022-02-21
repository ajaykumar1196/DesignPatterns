package decorator;

import domain.Coffee;

public class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }

    @Override
    public Double getCost() {
        return this.coffee.getCost();
    }
}
