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
    public double buyStock( String symbol, String stockName, int numShares, double price ){
        int i= 0; 
        int index = stocks.indexOf(symbol);
        if( index != -1 ) {

        }
    }

    public double sellStock (String symbol, int numShares)
    {
        int index = stocks.indexOf(symbol);

        if(index != -1)
        {
            stocks.sellShares(numShares);
        }

        
        return -1;
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

