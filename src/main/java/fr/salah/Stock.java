package fr.salah;

public class Stock {
    private final int quantity;
    private final StockType stockType;

    public Stock(int quantity, StockType stockType) {
        this.quantity = quantity;
        this.stockType = stockType;
    }

    public int getQuantity() {
        return quantity;
    }

    public StockType getStockType() {
        return stockType;
    }
}
