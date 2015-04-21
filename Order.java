
package SE350;

/**
 *
 * @author Daryl
 */
public class Order {
    String product;
    int OriQuantity; 
    int RemQuantity;
    int CanQuantity;
    String UserID;
    String side; 
    boolean quote = false;
    String ID; 
    Price Tradable = new Price();
    
    public void Order(String userName, String productSymbol, Price orderPrice, int originalVolume, Bookside side)
    {
        UserID = userName; 
        ID = productSymbol;
        //orderPrice - don't know what to do with it
        OriQuantity = originalVolume; 
        //Book side
    }
}
