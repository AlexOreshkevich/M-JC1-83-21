package by.academy.jc.t25;

import java.util.*;
import java.util.stream.Collectors;

public class Bankomat {

    private Map<Banknote, List<Banknote>> cashMap = new HashMap<>();

    public boolean addAmount(List<Banknote> cash) {
        try {
            cash.forEach(banknote -> {

                // check if request amount exists
                List<Banknote> banknotes = cashMap.get(banknote);
                if (banknotes == null) {
                    banknotes = new ArrayList<>();
                }

                // populate bankomat banknotes with new cash
                banknotes.add(banknote);
                cashMap.put(banknote, banknotes);
            });
            return true;
        } catch (Exception e) {
            System.out.println("Unable to populate bankomat");
            e.printStackTrace();
            return false;
        }
    }

    public boolean withdrawCash(int amount, Currency currency) {

        // initiate search: create a key
        List<Banknote> cash = cashMap.values().stream().flatMap(
                banknotes -> banknotes.stream().filter(
                        banknote -> banknote.getCurrency().equals(currency)
                )
        ).sorted()
                .collect(Collectors.toList());

        int targetAmount = 0;
        for (Banknote banknote : cash) {
            System.out.println("Processing " + banknote);
            targetAmount += banknote.getAmount();

            if (targetAmount == amount) {
                System.out.println("Cash withdrawal was successfull");
                // TODO remove banknotes from cashMap
                return true;
            }
        }

        System.out.println("Unable to withdraw the cash");
        return false;
    }
}
