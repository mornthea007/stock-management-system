public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    public void addStock(Stock stock) {
        stockService.createStock(stock);
    }

    public void updateStock(Long id, Stock stock) {
        stockService.modifyStock(id, stock);
    }

    public void deleteStock(Long id) {
        stockService.removeStock(id);
    }

    public Stock getStock(Long id) {
        return stockService.fetchStock(id);
    }
}