package com.manha.lista2ex1;

public class Time {
    private long start;
    private long end;

    public Time() { }

    public void start() {
        this.start = System.currentTimeMillis();
    }

    public void end() {
        this.end = System.currentTimeMillis();
    }

    public long elapsedTime() {
        return end - start;
    }
}
