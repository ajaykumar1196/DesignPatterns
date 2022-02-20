package domain;

public class Engine {
    private double volume;
    private double mileage;

    private Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", mileage=" + mileage +
                '}';
    }

    public static class Builder {
        private double volume;
        private double mileage;

        public Builder setVolume(double volume) {
            this.volume = volume;
            return this;
        }

        public Builder setMileage(double mileage) {
            this.mileage = mileage;
            return this;
        }

        public Engine build() {
            return new Engine(volume, mileage);
        }
    }
}
