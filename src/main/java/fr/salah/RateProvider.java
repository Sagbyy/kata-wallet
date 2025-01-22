package fr.salah;

@FunctionalInterface
public interface RateProvider {
    double rate(StockType from, Currency to);
}
