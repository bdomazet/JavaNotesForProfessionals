public class numericPrimitiveCasting {
    public static void main(String[] args) {

        //Implicit casting
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        //Explicit casting
        double doubleVar1 = 42.0d;
        float floatVar1 = (float) doubleVar1;
        long longVar1 = (long) floatVar1;
        int intVar1 = (int) longVar;
        short shortVar1 = (short) intVar1;
        byte byteVar1 = (byte) shortVar1;

    }
}
