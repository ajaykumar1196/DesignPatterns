public final class Singleton {

    private static Singleton instance;
    public String name;

    // Private constructor
    private Singleton(String name) {
        this.name = name;
    }
    // Method to get instance
    public static Singleton getInstance(String name) {
        /*
        We need it only for the first few threads who might create the separate instances.
        To avoid this extra overhead every time, double checked locking principle is used.
        In this approach, the synchronized block is used inside the if condition with an
        additional check to ensure that only one instance of a singleton class is created.
        */
        synchronized(Singleton.class){
            if(instance == null) {
                instance = new Singleton(name);
            }
        }
        return instance;
    }
}
