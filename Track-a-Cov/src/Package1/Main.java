package Package1;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException{
        
      
      API api = new API();
      api.getJ("https://api.rootnet.in/covid19-in/unofficial/covid19india.org/statewise","State");
      api.getJ("https://api.rootnet.in/covid19-in/contacts","Contacts");
      api.getJ("https://api.covidindiatracker.com/state_data.json","District");
      
     
      MainFrame mainFrame = new MainFrame();
      mainFrame.setVisible(true);
      mainFrame.setTime();
     NationalRetrieve nationalRetrieve = new NationalRetrieve(mainFrame);
     nationalRetrieve.gob();
     nationalRetrieve.national();
      
    }
}

