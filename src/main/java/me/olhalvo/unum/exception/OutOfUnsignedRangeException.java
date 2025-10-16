package me.olhalvo.unum.exception;

import me.olhalvo.unum.types.UNumber;

/**
 * Exception thrown when a value is out of range for an unsigned type
 *
 * @author Olhalvo
 */
public class OutOfUnsignedRangeException extends NumberFormatException {
    /**
     * Constructs a new OutOfUnsignedRangeException with the specified detail message.
     * @param type the type that the value is out of range for
     * @param value the value that is out of range
     * @param min the minimum value for the type
     * @param max the maximum value for the type
     */
    public OutOfUnsignedRangeException(Class<? extends UNumber> type, long value, long min, long max) {
        super("Value out of range for type " + type.getTypeName() + ". Value: " + value + ", Min: " + min + ", Max: " + max);
    }
}
