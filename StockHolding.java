import java.text.DecimalFormat;

/**
 * Write a description of class Asset here.
 *
 * @author (Jardina Gomez and Maggie F)
 * @version (a version number or a date)
 */
public class StockHolding
{
  
    private String Symbol;
    private String Name;
    private int numSharesHeld;
    private double StockPricePerShare;
    private static DecimalFormat price = new DecimalFormat("0.00");
    
    public StockHolding( String Symbol, String Name, int numSharesHeld, double StockPricePerShare){ 
        this.stock
        
    }
    
    
 @Override
    public String toString()
     {
         //DO NOT EDIT THIS METHOD.
         return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
         symbol, name, numShares, price, numShares * price); 
     }
}
