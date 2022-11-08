package transport;

public enum CapacityType {

    EXTRA_SMALL(0,10),
    SMALL(11,25),
    MIDDLE(40,50),
    BIG(60,80),
    EXTRA_BIG(100,120);

    public final int from;
    public final int to;

    CapacityType(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}

