package director;

import domain.*;

public class CarDirector {
    public void constructSportsCar(Car.Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine.Builder().setVolume(3).setMileage(0).build());
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator.Builder().setRoute("Delhi, India").build());
    }

    public void constructCityCar(Car.Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine.Builder().setVolume(1.2).setMileage(0).build());
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator.Builder().setRoute("Delhi, India").build());
    }

    public void constructSUV(Car.Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine.Builder().setVolume(2.5).setMileage(0).build());
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GPSNavigator.Builder().setRoute("Delhi, India").build());
    }
}
