package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public int getTotal() {
        return total;
    }

    private static final int TABLE_SIZE = 12;
    private static final int MINIMAL_TOTAL_SIZE = -1;
    private static final int EMPTY_TABLE = -1;
    private final int[] counter = new int[TABLE_SIZE];

    private int total = MINIMAL_TOTAL_SIZE;

    public void countIn(int in) {
        if (!isFull())
            counter[++total] = in;
    }
    public boolean callCheck() {
        return total == MINIMAL_TOTAL_SIZE;
    }

    public boolean isFull() {
        return total == TABLE_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_TABLE;
        return counter[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_TABLE;
        return counter[total--];
    }

}
