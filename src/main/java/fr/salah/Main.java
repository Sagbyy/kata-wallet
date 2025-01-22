package fr.salah;

public class Main {
    public static void main(String[] args) {
        RateProvider rateProvider = (from, to) -> {
            if (from == StockType.PETROLEUM && to == Currency.USD) {
                return 75.75;
            }
            else if (from == StockType.PETROLEUM && to == Currency.EUR) {
                return 72.70;
            }
            else if (from == StockType.BTC && to == Currency.USD) {
                return 104286.40;
            }
            else if (from == StockType.BTC && to == Currency.EUR) {
                return 100098.38;
            }
            else if (from == StockType.EUR && to == Currency.USD) {
                return 1.2;
            } else if (from == StockType.USD && to == Currency.EUR) {
                return 0.8;
            }
            else if (from == StockType.USD && to == Currency.USD) {
                return 1;
            }
            else if (from == StockType.EUR && to == Currency.EUR) {
                return 1;
            }
            else {
                throw new IllegalArgumentException("No rate for " + from + " to " + to);
            }
        };

        Wallet wallet = new Wallet();
        wallet.addStock(new Stock(5, StockType.PETROLEUM));

        System.out.println(wallet.value(Currency.USD, rateProvider));
    }
}
