import java.util.ArrayList;
/**
 * The Portfolio class represents a portfolio of the buying and selling of stocks. 
 *
 * @author (Maggie Frechette and Jardina Gomez)
 * @version (Spring 2023)
 */
public class Portfolio{

    private ArrayList<StockHolding> stocks;
    private double lifetimeInvestment;
    private double lifetimePayout;

    //constructor
    /**
     * Constructs the ArrayList of StockHolding objects to represent a portfolio that contains the number of stocks bought or sold
     * and initializes lifetimeInvestment, sum of all the stock purchases made, and lifetimePayout,sum of all the stock purchases 
     * sold,to 0. 
     * 
     */
    public Portfolio( ){
        stocks = new ArrayList<StockHolding>();
        lifetimeInvestment = 0.0;
        lifetimePayout = 0.0;
    }

    /**
     * Returns the lifetimeInvestment of the portfolio.
     * 
     * @return The lifetimeInvestment of the portfolio
     */
    public double getLifetimeInvestment(){
        return lifetimeInvestment;
    }

    /**
     * Returns the lifetimePayout of the portfolio 
     * 
     * @return The lifetimePayout of the portfolio 
     */
    public double getLifetimePayout(){
        return lifetimePayout;
    }

    /**
     * This method takes as input the stock symbol and returns the index of the stock in stocks that has the same stock symbol as
     * the input. Returns -1, if no stock was found in stocks .
     * 
     * @return getIndex The index of the stock in stocks that has the same stock symbol as input or -1 if no stock was not found
     * @param symbol The stock symbol to search for in stocks
     * 
     */
    private int getIndex(String symbol) {
        int index = 0; 
        int var = -1;
        for(StockHolding s : stocks)
        {
            if(stocks.get(index).getSymbol().equals(symbol))
            {
                var = index;
            }
            index++;
        }
        return var; 
    }

    /**
     * This method takes as input the stock symbol, name of stock, number of shares to
     * buy and the current price per share. 
     * 
     * If index of input symbol is in stocks, a share will be purchased given numShares and price
     * 
     * Else it will add the stock 
     * 
     * Cost and LifetimeInvestment are updated 
     * 
     * @param String symbol the symbol of the stock to search for, String stockName the name of the stock, 
     * int numShares the number of shares to be purchased, double price the price of each share
     * 
     * @return double cost; the cost of the number of shares times price per share
     * 
     */
    public double buyStock( String symbol, String stockName, int numShares, double price )
    {
        int found = getIndex(symbol);
        StockHolding sh = new StockHolding (symbol,stockName, numShares, price);
        double cost = 0.0;
        if(found != -1)
        {
            stocks.get(found).buyShares(numShares, price);
        }

        else
        {
            stocks.add(sh);
        }

        cost = numShares * price;
        lifetimeInvestment +=cost;
        
        return cost;
    }
    
    /**
     * This method takes as input a String symbol and an int numShares of the stock looking to be sold
     * 
     * If the stock is found, it is sold and if the stock number is not zero, it is removed from the portfolio
     * 
     * LifetimePayout is updated accordingly 
     * 
     * @param String symbol symbol of stock that is being sold, int numShares number of shares that are being sold
     * 
     * @return double profit Returns the profit made off of selling the shares by the given input
     */
    
    public double sellStock (String symbol, int numShares)
    {
        int index = getIndex(symbol);
        double profit = 0.0;
        if(index != -1)
        {
            profit = stocks.get(index).sellShares(numShares);
            if(stocks.get(index).getNumShares()==0)
            {
                stocks.remove(index);
            }
        }

        lifetimePayout += profit;

        return profit;
    }
    /**
     * This method takes no input and calculates and returns the total value of all of the stocks owned 
     * 
     * @return double value returns the total value of all of the stocks owned 
     */
    

    public double getCurrentValue()
    {

        int index = 0;
        double value = 0.0;
        for(StockHolding s: stocks)
        {
            value += stocks.get(index).getNumShares() * stocks.get(index).getPrice();
            index++;
        }

        return value;

    }

    /**
     * Returns a string representation for the format of the portfolio text output
     * 
     * @return a string representation for the format of the portfolio text output
     */
    @Override

    public String toString()
    {
        // //DO NOT EDIT THIS METHOD.
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%6s%25s%10s%15s%15s%n", 
                "Symbol", "Name", "Shares", "@Price", "Total"));
        sb.append("-----------------------------------------------------------------------\n");

        for(StockHolding s : stocks){
            sb.append(s.toString());
        }
        return sb.toString();
    }
}

