package me.olhalvo.unum.types.overflow;
import me.olhalvo.unum.types.UByte;

/**
 * Class used to represent an unsigned byte with overflow (wrap around) behavior
 * (0 to 255)
 *
 * @author Olhalvo
 */

public final class UByteO extends UByte{

    private static final long serialVersionUID = 1L;
    //private constructor to prevent instantiation
    private UByteO(short value){
        super(value & MAX_VALUE);
    }
    private UByteO(byte value){
        super(value & MAX_VALUE);
    }
    private UByteO(int value) {
        super(value & MAX_VALUE);
    }
    private UByteO(long value){
        super(value & MAX_VALUE);
    }

    /**
     * Static factory method to create a UByteO from a value
     * @param value the value to convert
     * @return the UByteO representation of the value
     * @author Olhalvo
     */
    public static UByteO valueOf(short value){
        return new UByteO(value);
    }

    /**
     * see: #valueOf(short)
     */
    public static UByteO valueOf(byte value){
        return new UByteO(value);
    }
    /**
     * see: #valueOf(short)
     */
    public static UByteO valueOf(long value){
        return new UByteO(value);
    }
    /**
     * see: #valueOf(short)
     */
    public static UByteO valueOf(int value){
        return new UByteO(value);
    }
    /**
     * Parses the string argument as an unsigned byte in base 10.
     * for limitations see {@link Short#parseShort(String)}
     * @param value the string to parse
     * @return the UByteO representation of the value
     */
    public static UByteO valueOf(String value){
        return new UByteO(Short.parseShort(value));
    }

    @Override
    protected UByteO newInstance(byte value){
        return valueOf(value);
    }
    @Override
    protected UByteO newInstance(short value){
        return valueOf(value);
    }
    @Override
    protected UByteO newInstance(int value){
        return valueOf(value);
    }
    @Override
    protected UByteO newInstance(long value){
        return valueOf(value);
    }
}