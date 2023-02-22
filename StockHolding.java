
/**
 * This class represents a text file that holds a list of stocks that were bought and sold for a particular stock portfolio 
 *
 * @author (Jardina Gomez and Maggie Frechette)
 * @version Spring 2023
 */
public class StockHolding
{
    private String symbol;
    private String name;
    private int numShares;
    private double price;

    /**Constructs a stock holding with inputted stock symbol, stock name, number of shares to add, and the cuurent price per 
     * share.
     * 
     * @param symbol The stock symbol
     * @param name The stock name 
     * @param numShares The number of shares held
     * @param price The current price per share 
     */
    public StockHolding(String symbol, String name, int numShares, double price){ 
        this.symbol = symbol;
        this.name = name;
        this.numShares = numShares;
        this.price = price; 
    }

    /**
     * Returns the stock symbol
     * 
     * @return The stock symbol
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * Returns the name of the stock
     * 
     * @return The stock name 
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the number of shares held
     * 
     * @return The number of shares held
     */
    public int getNumShares()
    {
        return numShares;
    }

    /**
     * Returns the current price per share 
     * 
     * @return The current price per share 
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * This method updates numShares with the input of the number of shares to buy updates price with the input PricePershare.   
     * 
     * @param numberOfShares The number of shares to buy and update numShares by
     * @param pricePerShare The price per share to update price by
     */
    public void buyShares(int numberOfShares, double pricePerShare)
    {
        numShares += numberOfShares;
        price = pricePerShare;
    }

    /**
     * This method sells a share and updates numShares if stock has at least as many shares as the input number of shares to sell.
     * Otherwise no share is sold. This method returns the number of shares to sell times the price per share.
     * 
     * 
     * @return sellShares The number of shares to sell times the price per share 
     * @param numSharesToSell The number of shares to sell
     * 
     */
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

    /**
     * Returns a string representation of a files transaction of a list of stocks bought and sold for a particular stock portfolio.
     *  
     * @return A string representation of a file transaction of a list of stocks bought and sold
     */
    @Override
    public String toString()
    {
        //DO NOT EDIT THIS METHOD.
        return String.format("%6s%25s%,10d  $%,12.2f  $%,12.2f%n", 
            symbol, name, numShares, price, numShares * price); 
    }
}
