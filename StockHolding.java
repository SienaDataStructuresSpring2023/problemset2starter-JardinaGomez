import java.text.DecimalFormat;
/**
 * Write a description of class Asset here.
 *
 * @author (Jardina Gomez and Maggie Frechette)
 * @version (a version number or a date)
 */
public class StockHolding
{
<<<<<<< HEAD
=======


>>>>>>> 6db6399dd19c86be859f1e424bc0c04ed2d5361a
    private String symbol;
    private String name;
    private int numShares;
    private double price;
<<<<<<< HEAD
    
    public StockHolding( String symbol, String name, int numShares, double price){ 
=======

    public StockHolding( String Symbol, String Name, int numSharesHeld, double price){ 
>>>>>>> 6db6399dd19c86be859f1e424bc0c04ed2d5361a
        this.symbol = symbol;
        this.name = name;
        this.numShares = numShares;
        this.price = price; 
<<<<<<< HEAD
=======
        
        

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
  
   
        
>>>>>>> 6db6399dd19c86be859f1e424bc0c04ed2d5361a
    }
    
    public String getSymbol()
    {
        return symbol;
    }

    public String getName()
    {
        return name;
    }
    
    public int getnumShares()
    {
        return numShares;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void buyShares(int numberOfShares, double pricePerShare)
    {
        numShares = numberOfShares;
        price = pricePerShare;
    }
    
    public double sellShares(int numSharesToSell)
    {
        double profit = 0.0;
        if(numSharesToSell <= numShares)
        {
            numShares = numShares - numSharesToSell;
            profit = numSharesToSell*price;
        }
        return profit;
    }
    
    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
            symbol, name, numShares, price, numShares * price); 
    }
}
