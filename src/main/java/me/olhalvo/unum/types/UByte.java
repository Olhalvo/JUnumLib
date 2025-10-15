package me.olhalvo.unum.types;

/**
 * Class used to represent an unsigned byte (0 to 255)
 *
 * @author Olhalvo
 */
public final class UByte extends UNumber implements Comparable<UByte> {

    private static final long serialVersionUID = 1510047123516292284L;
    /**
     * The minimum value an UByte can have (0)
     */
    private static final short MIN_VALUE = 0;
    /**
     * The maximum value an UByte can have (255)
     */
    private static final short MAX_VALUE = 0xFF;
    /**
     * The value of this UByte stored as a short
     * to avoid sign issues
     */
    private final short value;

    /**
     * Returns a UByte instance representing the specified value
     * @param value the value to represent
     * @return a UByte instance representing the specified value
     * @throws OutOfUnsignedRangeException if the value is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public static UByte valueOf(short value) throws OutOfUnsignedRangeException {
        return new UByte(value);
    }

    /**
     * see {@link UByte#valueOf(short)}
     */
    public static UByte valueOf(byte value) {
        return new UByte(value);
    }
    /**
     * see {@link UByte#valueOf(short)}
     */
    public static UByte valueOf(long value) throws OutOfUnsignedRangeException {
        return new UByte(value);
    }
    /**
     * see {@link UByte#valueOf(short)}
     */
    public static UByte valueOf(int value) throws OutOfUnsignedRangeException {
        return new UByte(value);
    }
    /**
     * see {@link UByte#valueOf(short)}
     */
    public static UByte valueOf(String value) throws OutOfUnsignedRangeException {
        return new UByte(Short.parseShort(value));
    }

    //Private constructors to force the use of valueOf methods (they are prettier :3)
    private UByte(short value) throws OutOfUnsignedRangeException{
        this.value = value;
        if(!isValid(value))
            throw new OutOfUnsignedRangeException(UByte.class, value, MIN_VALUE, MAX_VALUE);
    }

    private UByte(byte value) {
        this.value = (short)(value & MAX_VALUE);
    }

    private UByte(long value) throws OutOfUnsignedRangeException {
        this.value = (short) value;
        if(!isValid(value))
            throw new OutOfUnsignedRangeException(UByte.class, value, MIN_VALUE, MAX_VALUE);
    }

    private UByte(int value) throws OutOfUnsignedRangeException {
        this.value = (short) value;
        if(!isValid(value))
            throw new OutOfUnsignedRangeException(UByte.class, value, MIN_VALUE, MAX_VALUE);
    }

    //private method to check if a value is in range
    private static boolean isValid(long value) {
        return value >= MIN_VALUE && value <= MAX_VALUE;
    }

    private static boolean isValid(int value) {
        return value >= MIN_VALUE && value <= MAX_VALUE;
    }

    private static boolean isValid(short value) {
        return (value >= MIN_VALUE) && (value <= MAX_VALUE);
    }

    /**
     * see {@link Number#intValue()}
     */
    @Override
    public int intValue() {
        return value;
    }
    /**
     * see {@link Number#longValue()}
     */
    @Override
    public long longValue() {
        return value;
    }
    /**
     * see {@link Number#floatValue()}
     */
    @Override
    public float floatValue() {
        return value;
    }
    /**
     * see {@link Number#doubleValue()}
     */
    @Override
    public double doubleValue() {
        return value;
    }
    /**
     * see {@link Byte#compareTo(Byte)}
     */
    @Override
    public int compareTo(UByte o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return (Short.toString(value));
    }

    /**
     * Checks equality between this UByte and another object
     * @return true if the other object is either an exact copy of this
     * or a Number with the same value as this UByte, otherwise false
     * @param obj   the reference object with which to compare.
     * @author Olhalvo
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj instanceof Number) {
            Number n = (Number) obj;
            return n.longValue() == this.value;
        }
        return false;

    }
    @Override
    public int hashCode() {
        return Short.hashCode(value);
    }

    /**
     * Adds the given number to this UByte and returns a new UByte with the result
     * @param b the number to add
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte add(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value + b.longValue());
    }

    /**
     * Subtracts the given number to this UByte and returns a new UByte with the result
     * @param b the number to subtract
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte subtract(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value - b.longValue());
    }

    /**
     * Multiplies this Ubyte by the passed number and returns a new UByte with the result
     * @param b the number to multiply by
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte multiply(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value * b.longValue());
    }

    /**
     * Divides this Ubyte by the passed number and returns a new UByte with the result
     * @param b the number to Divide by
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte divide(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value / b.longValue());
    }

    /**
     * Calculates the remainder of this Ubyte divided by the passed number and returns a new UByte with the result
     * @param b the number to divide by
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte remainder(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value % b.longValue());
    }

    /**
     * Performs a bitwise AND operation between this UByte and the given number, returning a new UByte with the result
     * @param b the number to AND with
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @author Olhalvo
     */
    public <T extends Number> UByte and(T b){
        //never throws exception because the result is always in range
        return UByte.valueOf(this.value & b.longValue());
    }

    /**
     * Performs a bitwise OR operation between this UByte and the given number, returning a new UByte with the result
     * @param b the number to OR with
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte or(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value | b.longValue());
    }

    /**
     * Performs a bitwise XOR operation between this UByte and the given number, returning a new UByte with the result
     * @param b the number to XOR with
     * @return a new UByte with the result
     * @param <T> the type of the number
     * @throws OutOfUnsignedRangeException if the result is out of range({@link UByte#MIN_VALUE} to {@link UByte#MAX_VALUE})
     * @author Olhalvo
     */
    public <T extends Number> UByte xor(T b) throws OutOfUnsignedRangeException {
        return UByte.valueOf(this.value ^ b.longValue());
    }
    /**
     * Performs a bitwise NOT operation on this UByte
     * @return a new UByte with the result
     */
    public UByte not(){
        //never throws exception because the result is always in range
        return UByte.valueOf(~this.value & MAX_VALUE);
    }

    /**
     * Performs a logical left shift operation on this UByte
     * @param n the number of bits to shift
     * @return a new UByte with the result
     */
    public UByte lsl(int n){
        //never throws exception because the result is always in range
        return UByte.valueOf((this.value << n) & MAX_VALUE);
    }

    /**
     * Performs a logical right shift operation on this UByte
     * @param n the number of bits to shift
     * @return a new UByte with the result
     */
    public UByte lsr(int n){
        //never throws exception because the result is always in range
        return UByte.valueOf((this.value & MAX_VALUE) >>> n);
    }

}
