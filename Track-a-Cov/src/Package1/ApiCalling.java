
package Package1;

public class ApiCalling implements Runnable{

    @Override
    public void run() {
        API api = new API();
        
        
            try{
     api.getJ("https://api.rootnet.in/covid19-in/unofficial/covid19india.org/statewise","State");
     api.getJ("https://api.rootnet.in/covid19-in/contacts","Contacts");
     api.getJ("https://api.covidindiatracker.com/state_data.json","District");
          
     
     
        }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    
    
}
}
