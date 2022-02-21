package domain;

public class Espresso implements Coffee{

    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public Double getCost() {
        return 4.0;
    }
}
