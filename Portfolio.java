import java.util.ArrayList;

/**
 * Write a description of class Portfolio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Portfolio
{
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
    private int getIndex( String symbol ) {
        int i = 0; 
        int index = stocks.indexOf(symbol); 
        if (index != -1 && i < stocks.size() ) {
        
            if( stocks.get(index).equals(stocks.get(getSymbol()))){
                return index;
            }
            else {
            i++;
            }
            
        }else {
            return -1;
        }     
    
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

