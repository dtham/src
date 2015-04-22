
package SE350;


public class Quote {
    String UserName;
    String StockSymbol;
    QuoteSide Buy = new QuoteSide();
    QuoteSide Sell = new QuoteSide();
    Price PriceOrder = new Price();
    
    public void Quote(String userName, String productSymbol, Price buyPrice,
            int buyVolume, Price sellPrice, int sellVolume){
        UserName = userName; 
        StockSymbol = productSymbol;
        PriceOrder = buyPrice; 
        Buy(UserName, StockSymbol, PriceOrder, buyVolume, bookSide); //bookside not created yet.
    }
    
    public String getUserName(){
        return UserName;
    }
    
    public String getProduct(){
        return StockSymbol;
    }
    
    public QuoteSide getQuoteSide(Bookside sideIn){
        //work on this
    }
    
    public String toString(){
        
    }
}
