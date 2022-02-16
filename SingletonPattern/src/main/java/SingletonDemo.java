public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singletonFirst = Singleton.getInstance("First");
        System.out.println(singletonFirst.name);
        Singleton singletonSecond = Singleton.getInstance("Second");
        System.out.println(singletonSecond.name);

        Thread firstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singletonFirst = Singleton.getInstance("First Thread");
                System.out.println(singletonFirst.name);
            }
        });

        Thread secondThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singletonSecond = Singleton.getInstance("Second Thread");
                System.out.println(singletonSecond.name);
            }
        });

        firstThread.start();
        secondThread.start();
    }
}
