import java.text.DecimalFormat;
/**
 * Write a description of class Asset here.
 *
 * @author (Jardina Gomez and Maggie Frechette)
 * @version (a version number or a date)
 */
public class StockHolding
{
    private String symbol;
    private String name;
    private int numShares;
    private double price;
    
    public StockHolding(String symbol, String name, int numShares, double price){ 
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
