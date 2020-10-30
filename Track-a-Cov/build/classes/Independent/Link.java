package Independent;
import java.awt.Desktop;
import java.net.URI;
public class Link {
    public static void main(String[] args){
        String s = "https://www.who.int/";  
        try{
        Desktop d = Desktop.getDesktop();  
        d.browse(new URI(s));              //passing the string as an argument   
    }
        catch(Exception e){
            System.out.println("An error occured "+e.getMessage());          //exception handled in case a false URL is entered
        }
    }
    
}
