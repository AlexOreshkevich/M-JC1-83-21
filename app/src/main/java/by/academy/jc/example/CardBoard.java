package by.academy.jc.example;

import com.google.common.base.MoreObjects;

public class CardBoard {

    private double r;

    public CardBoard(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("r", r)
                .toString();
    }
}
