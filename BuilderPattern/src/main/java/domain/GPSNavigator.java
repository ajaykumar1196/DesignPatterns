package domain;

public class GPSNavigator {
    private String route;

    private GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "GPSNavigator{" +
                "route='" + route + '\'' +
                '}';
    }

    public static class Builder {
        private String route;

        public Builder setRoute(String route) {
            this.route = route;
            return this;
        }

        public GPSNavigator build() {
            return new GPSNavigator(route);
        }

    }
}
