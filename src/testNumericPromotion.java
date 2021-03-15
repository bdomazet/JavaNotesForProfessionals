public class testNumericPromotion {
    public static void main(String[] args) {


        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;

        // char1 = char1 + char2; error:cannot convert from int to char
        //short1 =short1 + short2;  error:cannot convert from int to short

        int1 = char1 + char2;
        int1 = int1 + int2;
        int1 = short1 + short2;
        int1 = char1 + char2;
        float1 = short1 + float1;

    }
}
