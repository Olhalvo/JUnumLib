package me.olhalvo.unum.types;

/**
 * Class used to represent an unsigned short (0 to 65535)
 *
 * @author Olhalvo
 */
public class UShort extends Number implements Comparable<UShort> {
    private static final long serialVersionUID = -7889639490505317347L;
    /**
     * The minimum value an UShort can have
     * @see #MAX_VALUE
     **/
    public static final int MIN_VALUE = 0;
    /**
     * The maximum value an UShort can have
     * @see #MIN_VALUE
     **/
    public static final int MAX_VALUE = 65535;
    /**
     * The value of this UShort stored as an int
     * to avoid sign issues
     * @see #MIN_VALUE
     * @see #MAX_VALUE
     **/
    private final int value;

    protected UShort(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(UShort o) {
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
