import java.text.DecimalFormat;

/**
 * Write a description of class Asset here.
 *
 * @author (Jardina Gomez and Maggie F)
 * @version (a version number or a date)
 */
public class StockHolding
{


    private String symbol;
    private String name;
    private int numShares;
    private double price;

    public StockHolding( String Symbol, String Name, int numSharesHeld, double price){ 
        this.symbol = symbol;
        this.name = name;
        this.numShares = numShares;
        this.price = price; 
        
        

    }
    
    public String getSymbol()
    {
        return symbol;
    }

    public String getName()
    {
        return name;
    }
    
    public int getNumShares()
    {
        return numShares;
    }
    
    public double getPrice()
    {
        return price;
  
   
        
    }
    
    
    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
            symbol, name, numShares, price, numShares * price); 
    }
}
