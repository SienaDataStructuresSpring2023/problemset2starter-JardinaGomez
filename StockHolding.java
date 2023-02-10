/**
 * Write a description of class Asset here.
 *
 * @author (Jardina Gomez and Maggie F)
 * @version (a version number or a date)
 */
public class StockHolding
{
  
    private String stockSymbol;
    private String stockName;
    private String numSharesHeld;
    private String currentStockPricePerShare;
    
    
 @Override
    public String toString()
     {
         //DO NOT EDIT THIS METHOD.
         return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
         symbol, name, numShares, price, numShares * price); 
     }
}
