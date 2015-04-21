
package SE350;

/**
 *
 * @author Daryl
 */
public class Tradable {
    String product;
    int OriQuantity; 
    int RemQuantity;
    int CanQuantity;
    String UserID;
    String side; 
    boolean quote = false; 
    Price TradableP = new Price();
    
    
    String getProduct(){
        return product; 
    }
    
    long getPrice(){
        return TradableP.P; 
    } //I used long instead of Price because of the long return method
    
    int getOriginalVolume(){
        return OriQuantity;
    }
    
    int getRemainingVolume(){
        return RemQuantity;
    }
    
    int getCancelledVolume(){
        return CanQuantity;
    }
    
    void setCancelledVolume(int newCancelledVolume){
        int check; 
        check = newCancelledVolume + RemQuantity; 
        
        if (newCancelledVolume <0 || check < OriQuantity)
        {
            System.out.println("Value is invalid");
        }
        else
        {
            CanQuantity = newCancelledVolume; 
        }
    }
    
    void setRemainingVolume(int newRemainingVolume){
        int check;
        check = newRemainingVolume + CanQuantity; 
        
        if(newRemainingVolume < 0 || check < OriQuantity){
            System.out.println("Value is invalid");
        }
        else
        {
            RemQuantity = newRemainingVolume;
        }
    }
    
    String getUser(){
        return UserID; 
    }
    
    String getSide(){
        return side;
    }
    
    boolean isQuote(){
        return this.quote;
        //not sure about this. check.
    }
    
    String getId(){
        
    }
}

