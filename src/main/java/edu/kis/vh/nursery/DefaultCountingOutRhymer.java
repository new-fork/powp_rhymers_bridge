package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR = -1;
    private static final int CAPACITY = 12;
    private static final int MAX = 11;
    private int[] numbers = new int[CAPACITY];

    private int total = ERROR;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }


}
