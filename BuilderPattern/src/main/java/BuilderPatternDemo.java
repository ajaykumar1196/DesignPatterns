import director.CarDirector;
import domain.Car;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        Car.Builder carBuilder = new Car.Builder();
        director.constructCityCar(carBuilder);
        System.out.println(carBuilder.build());

        director.constructSportsCar(carBuilder);
        System.out.println(carBuilder.build());

        director.constructSUV(carBuilder);
        System.out.println(carBuilder.build());
    }
}
