package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    int reportRejected() {
        return getTotalRejected();
    }

    public void countIn(int in) {
        if (!isEmpty() && in > currentNumber()){
            setTotalRejected(getTotalRejected() + 1);
        } else{
            super.countIn(in);
        }
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
