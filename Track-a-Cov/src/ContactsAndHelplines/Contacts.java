
package ContactsAndHelplines;

import java.util.List;

public class Contacts {
    private Primary primary;
    private List<Regional> regional;
    public void setPrimary(Primary primary){
        this.primary = primary;
}
    public Primary getPrimary(){
        return primary;
    }
    public void setRegional(List<Regional> regional){
        this.regional = regional;
    }
    public List<Regional> getRegional(){
        return regional;
}
}
