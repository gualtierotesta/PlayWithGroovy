package mixed;

public class JData {

    private final int c;

    public JData(final int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("JData [c=");
        builder.append(c);
        builder.append("]");
        return builder.toString();
    }

}
