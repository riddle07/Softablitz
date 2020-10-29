
package StatePackage;
import java.util.List;


public class Data {
     private List<statewise> statewise;
    private String source;
    private String lastRefreshed;
    private Total total;
    public void setStatewis(List<statewise> statewise){
        this.statewise = statewise;
}
    public List<statewise> getStatewise(){
        return statewise;
    }
    public void setLastRefreshed(String lastRefreshed){
        this.lastRefreshed = lastRefreshed;
}
    public String getLastRefreshed(){
        return lastRefreshed;
    }
    public void setTotal(Total total){
        this.total = total;
    }
    public Total getTotal(){
        return total;
    }
    
}
