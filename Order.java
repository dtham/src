
package SE350;

/**
 *
 * @author Daryl
 */
public class Order {
	
	String onePartOfID;
	String time_nano;
    String product;
    int OriQuantity; 
    int RemQuantity;
    int CanQuantity;
    String UserID;
    String b_side; 
    String ID; 
    Price PriceOrder = new Price();
    Price Tradable = new Price();

    
    public void Order(String userName, String productSymbol, Price orderPrice, int originalVolume, Bookside side)
    {
        UserID = userName; 
        product = productSymbol;
        b_side = side;
        OriQuantity = originalVolume; 
        time_nano = Long.toString(System.nanoTime());
        PriceOrder = orderPrice;
        onePartOfID = PriceOrder.toString();
        ID = UserID + product + onePartOfID + time_nano;
    }
    
   public String getProduct() {
	   return this.product;
   }
   
   public int getRemainingVolume(){
	   return this.RemQuantity;
   }
   
   public void setRemainingVolume(int newRemainingVolume) {
	   RemQuantity = newRemainingVolume;
   }
   
   public String toString() {
	   String sum_string;
	   sum_string = UserID + "order:" + b_side + " " + OriQuantity + " " + '$'+ PriceOrder + "( Original Vol: " + OriQuantity + ", CXL'd Vol: " + CanQuantity + "), ID: " + ID;
	   return sum_string;
   }
}
