
package Package1;
import ContactsAndHelplines.BASE3;
import DistrictWise.BASE4;
import StatePackage.STATE;
import java.io.File;
import java.util.*;
import com.google.gson.Gson;

public class ObjectRetrieve {
    
    protected String s;
    protected Scanner x;
    
    
    public void gob(){
    /*Method to be overrided by each of the parent class 
     used for the conversion of the JSON data into java objects using GSON*/
    }
}

class StateRetrieve extends ObjectRetrieve{
     //For handling JSON File of national data
    String s = "";
    STATE state = null;
    StateSearch stateSearch;
    StateRetrieve(StateSearch s){
        this.stateSearch = s;
    }
    @Override
    
    public void gob(){
         try{
            x = new Scanner(new File("C:\\Users\\HP\\Desktop\\Softablitz\\Track-a-Cov\\State.text"));
    }
        catch(Exception e){
            System.out.println("Could not find the file");
        }
        while(x.hasNext()){
            s+=x.next();
        }
        state = new Gson().fromJson(s, STATE.class);
        
        
    }
    void state(String se){ 
   //For testing the data of state data
        for(int i = 0;i<state.getData().getStatewise().size();i++){
            if(state.getData().getStatewise().get(i).getState().equalsIgnoreCase(se)){
                stateSearch.setaTextField(state.getData().getStatewise().get(i).getActive());
                stateSearch.setcTextField(state.getData().getStatewise().get(i).getConfirmed());
                stateSearch.setrTextField(state.getData().getStatewise().get(i).getRecovered());
                stateSearch.setdTextField(state.getData().getStatewise().get(i).getDeaths());
                break;
        }
       }
    }
    
}
 class NationalRetrieve extends ObjectRetrieve{
    //For handling JSON File of state data
    String s = "";
    STATE state = null;
    MainFrame mainFrame;
    NationalRetrieve(MainFrame f){
        this.mainFrame = f;
    }
    @Override
    
    public void gob(){
         try{
            x = new Scanner(new File("C:\\Users\\HP\\Desktop\\Softablitz\\Track-a-Cov\\State.text"));
    }
        catch(Exception e){
            System.out.println("Could not find the file");
        }
        while(x.hasNext()){
            s+=x.next();
        }
        state = new Gson().fromJson(s, STATE.class);
        
        
    }
     
     void national(){ 
//For testing the result of national data
        mainFrame.setaTextField(state.getData().getTotal().getActive());
        mainFrame.setcTextField(state.getData().getTotal().getConfirmed());
        mainFrame.setrTextField(state.getData().getTotal().getRecovered());
        mainFrame.setdTextField(state.getData().getTotal().getDeaths());
        //mainFrame.setTime(state.getData().getLastRefreshed());
}
     
}

class DistrictRetrieve extends ObjectRetrieve{
    //For handling JSON File of District Data
    SearchDistrict searchDistrict;
    DistrictRetrieve(SearchDistrict s){
        this.searchDistrict = s;
    }
    String s = "";
    BASE4 base4 = null;
    @Override
    public void gob(){
         try{
            x = new Scanner(new File("C:\\Users\\HP\\Desktop\\Softablitz\\Track-a-Cov\\District.text"));
    }
        catch(Exception e){
            System.out.println("Could not find the file");
        }
        while(x.hasNext()){
            s+=x.next();
        }
       base4 = new Gson().fromJson("{\"state\":"+s+"}",BASE4.class);
  }
    void district(String se){ //For testing the result of search in district data
        for(int i = 0;i<base4.getState().size();i++){
            for(int j = 0;j<base4.getState().get(i).getDistrictData().size();j++){
                if(base4.getState().get(i).getDistrictData().get(j).getName().equalsIgnoreCase(se)){
                    searchDistrict.setjTextField1(base4.getState().get(i).getDistrictData().get(j).getConfirmed());
                }
            }
    }  
}
}
class ContactRetrieve extends ObjectRetrieve{
    
    CandH candh;
    ContactRetrieve(CandH c){
        this.candh = c;
    }
    String s = "";
    BASE3 base3  =null;
    @Override
    public void gob(){
         try{
            x = new Scanner(new File("C:\\Users\\HP\\Desktop\\Softablitz\\Track-a-Cov\\Contacts.text"));
    }
        catch(Exception e){
            System.out.println("Could not find the file");
        }
        while(x.hasNext()){
            s+=x.next();
        }
        base3 = new Gson().fromJson(s,BASE3.class);
  }
    
    

     void state(String se){ //For testing the result of statewise helpline number
         for(int i = 0; i<base3.getData().getContacts().getRegional().size();i++){
             if(base3.getData().getContacts().getRegional().get(i).getLoc().equalsIgnoreCase(se)){
                 candh.setNumber(base3.getData().getContacts().getRegional().get(i).getNumber());
                 break;
     }
        
}
     }
}
