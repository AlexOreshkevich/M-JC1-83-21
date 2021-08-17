package by.academy.jc.t25;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.Currency;

public class Banknote implements Comparable<Banknote> {

    private Currency currency;

    private int amount;

    public Banknote(Currency currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("currency", currency)
                .add("amount", amount)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banknote banknote = (Banknote) o;
        return amount == banknote.amount && Objects.equal(currency, banknote.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(currency, amount);
    }

    @Override
    public int compareTo(Banknote o) {
        return Integer.compare(this.amount, o.amount);
    }
}
