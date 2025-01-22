package fr.salah;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private final List<Stock> stocks;

    public Wallet() {
        this.stocks = new ArrayList<>();
    }

    public double value(Currency currency, RateProvider rateProvider) {
        return stocks.stream()
                .mapToDouble(stock -> stock.getQuantity() * rateProvider.rate(stock.getStockType(), currency))
                .sum();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }
}
