public class NoZerosForHeros {

    public static int noBoringZeros(int n) {
        return n == 0 ? 0 : reduce(n);
    }

    private static int reduce(int n) {
        int value = n;
        while (value % 10 == 0) {
            value = value / 10;
        }
        return value;
    }
}
