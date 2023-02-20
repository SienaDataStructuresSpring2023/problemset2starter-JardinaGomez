import java.util.ArrayList;

/**
 * Write a description of class Portfolio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Portfolio{

    private ArrayList<StockHolding> stocks;
    private double lifetimeInvestment;
    private double lifetimePayout;

    //constructor
    /**
     * 
     */
    public Portfolio( ){
        stocks = new ArrayList<StockHolding>();
        lifetimeInvestment = 0.0;
        lifetimePayout = 0.0;
    }

    public double getLifetimeInvestment(){
        return lifetimeInvestment;
    }

    public double getLifetimePayout(){
        return lifetimePayout;
    }

    /**
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
     * This method takes the stock symbol, name of stock, number of shares to
     * buy and the current price per share as input.
     */
    public double buyStock( String symbol, String stockName, int numShares, double price )
    {
        int found = getIndex(symbol);
        StockHolding sh = new StockHolding (symbol,stockName, numShares, price);
        double cost = 0.0;
        if(found > -1)
        {
            stocks.get(found).buyShares(numShares, price);
            cost = numShares * price;
            lifetimeInvestment += cost;
        }
        
        else
        {
            stocks.add(sh);
        }
        
        return cost;
    }

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
     * 
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

