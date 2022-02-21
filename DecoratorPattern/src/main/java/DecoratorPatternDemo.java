import decorator.Mocha;
import decorator.Whip;
import domain.Coffee;
import domain.DarkRoast;

public class DecoratorPatternDemo {
    public static void main (String args[]) {
        Coffee darkRoast = new DarkRoast() ;
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println (darkRoast.getDescription() + " $" + darkRoast.getCost()) ;
    }
}
