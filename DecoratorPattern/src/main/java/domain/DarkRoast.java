package domain;

public class DarkRoast implements Coffee{
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
