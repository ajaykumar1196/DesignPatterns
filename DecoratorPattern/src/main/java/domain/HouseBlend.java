package domain;

public class HouseBlend implements Coffee{
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public Double getCost() {
        return 3.5;
    }
}
