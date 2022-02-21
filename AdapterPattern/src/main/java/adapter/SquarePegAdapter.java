package adapter;

import domain.RoundPeg;
import domain.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) (Math.sqrt(Math.pow((squarePeg.getSide() / 2.0), 2) * 2));
    }
}
