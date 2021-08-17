package by.academy.jc.t25;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankomatTest {

    Currency currency = Currency.getInstance(Locale.US);

    @Test
    public void shouldWithdrawCash() {

        List<Banknote> banknoteList = new ArrayList<>();
        banknoteList.add(new Banknote(currency, 20));
        banknoteList.add(new Banknote(currency, 20));
        banknoteList.add(new Banknote(currency, 20));

        Bankomat bankomat = new Bankomat();
        bankomat.addAmount(banknoteList);

        assertTrue(bankomat.withdrawCash(60, currency));
    }

    @Test
    public void shouldFailToWithdrawWhenAmountIsNotEnough() {
        List<Banknote> banknoteList = new ArrayList<>();
        banknoteList.add(new Banknote(currency, 20));
        banknoteList.add(new Banknote(currency, 50));

        Bankomat bankomat = new Bankomat();
        bankomat.addAmount(banknoteList);

        assertFalse(bankomat.withdrawCash(100, currency));
    }
}
