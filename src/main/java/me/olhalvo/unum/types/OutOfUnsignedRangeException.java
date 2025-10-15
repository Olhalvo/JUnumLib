package me.olhalvo.unum.types;

/**
 * Exception thrown when a value is out of range for an unsigned type
 *
 * @author Olhalvo
 */
public class OutOfUnsignedRangeException extends NumberFormatException {
    private static final long serialVersionUID = 1L;

    public OutOfUnsignedRangeException(Class<?> type, long value, long min, long max) {
        super("Value out of range for type " + type.getTypeName() + ". Value: " + value + ", Min: " + min + ", Max: " + max);
    }
}
