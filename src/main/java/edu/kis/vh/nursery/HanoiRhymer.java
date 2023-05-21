package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int REJECTED_NUMBER = 0;
    private int totalRejected = REJECTED_NUMBER;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

}
