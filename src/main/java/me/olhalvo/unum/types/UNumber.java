package me.olhalvo.unum.types;

/**
 * Abstract class used to represent all unsigned number types
 *
 * @author Olhalvo
 */
public abstract class UNumber extends Number implements Comparable<Number> {

    private static final long serialVersionUID = -6870012790496809770L;

    @Override
    public int compareTo(Number o) {
        if (o == null) {
            throw new NullPointerException("Cannot compare to null");
        }
        return Long.compare(this.longValue(), o.longValue());
    }
}
