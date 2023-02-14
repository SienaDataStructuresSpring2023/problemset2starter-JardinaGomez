import java.text.DecimalFormat;

/**
 * Write a description of class Asset here.
 *
 * @author (Jardina Gomez and Maggie F)
 * @version (a version number or a date)
 */
public class StockHolding
{
<<<<<<< HEAD

    private String Symbol;
    private String Name;
    private int numSharesHeld;
    private double StockPricePerShare;
    private static DecimalFormat price = new DecimalFormat("0.00");

    public StockHolding( String Symbol, String Name, int numSharesHeld, double StockPricePerShare){ 
        this.stock

    }
    
    public String getSymbol()
    {
        return Symbol;
    }

    public String getName()
    {
        return Name;
    }
    
    public String getnumSharesHeld()
    {
        return numSharesHeld;
    }
    
    public String getStockPricePerShare()
    {
        return StockPricePerShare;
=======
  
    private String symbol;
    private String name;
    private int numShares;
   
    private double price;     
    public StockHolding( String symbol, String name, int numShares, double price){ 
        this.symbol = symbol;
        this.name = name;
        this.numShares = numShares;
        this.price = price; 
        
        
>>>>>>> eb622e36e0fa0e3028f2b4baff222a83d95ba4dc
    }
    
    
    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
            symbol, name, numShares, price, numShares * price); 
    }
}
