package me.olhalvo.unum.types.overflow;

import me.olhalvo.unum.types.OutOfUnsignedRangeException;
import me.olhalvo.unum.types.UByte;

public final class UByteO extends UByte implements Comparable<UByteO> {

    private static final long serialVersionUID = 1L;

    private UByteO(short value) throws OutOfUnsignedRangeException {
        super(value);
    }
    private UByteO(byte value) throws OutOfUnsignedRangeException {
        super(value);
    }
    private UByteO(int value) throws OutOfUnsignedRangeException {
        super(value);
    }
    private UByteO(long value) throws OutOfUnsignedRangeException {
        super(value);
    }

    public static UByteO valueOf(short value) throws OutOfUnsignedRangeException {
        return new UByteO(value);
    }

    public static UByteO valueOf(byte value) {
        return new UByteO(value);
    }

    public static UByteO valueOf(long value) throws OutOfUnsignedRangeException {
        return new UByteO(value);
    }

    public static UByteO valueOf(int value) throws OutOfUnsignedRangeException {
        return new UByteO(value);
    }

    public static UByteO valueOf(String value) throws OutOfUnsignedRangeException {
        return new UByteO(Short.parseShort(value));
    }

    @Override
    public int compareTo(UByteO o) {
        return super.compareTo(o);
    }


}