package Package1;

import  java.net.http.HttpClient;
import  java.net.http.HttpRequest;
import  java.net.http.HttpResponse;
import java.net.URI;
import java.io.*;

public class API {
    //To make http request and store the data in JSON form in file
    public void getJ(String url, String name) throws IOException {
        //Passing the url of the API and the file name where it is to be stored
        var client = HttpClient.newHttpClient();
        var httpRequest = HttpRequest.newBuilder()
        .uri(URI.create(String.format(url)))
        .GET()
        .build();
        try{
            var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            File f = new File("C:\\Users\\HP\\Desktop\\Softablitz\\Track-a-Cov\\"+name+".text");
            if(f.exists()){ 
                /*Checking for the existence of the file
                Deleting if exists[For Reloading Purpose]*/
                                                                      
                f.delete();
            }
            f.createNewFile();
            FileWriter fw  = new FileWriter(f,true);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(response.body());  //Writing the JSON string in the file
            bf.close();
           }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
