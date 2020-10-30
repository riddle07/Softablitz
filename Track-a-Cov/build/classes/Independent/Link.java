/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Independent;

/**
 *
 * @author rishu
 */
import java.awt.Desktop;
import java.net.URI;
public class Link {
    public static void main(String[] args){
        String s = "https://www.who.int/";  
        try{
        Desktop d = Desktop.getDesktop();
        d.browse(new URI(s));                 
    }
        catch(Exception e){
            System.out.println("An error occured "+e.getMessage());
        }
    }
    
}
