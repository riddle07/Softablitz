package com.mycompany.track_a_cov;
import java.net.URI;
import java.awt.Desktop;
public class Link {
     public static void main(String[] args) {
        String s = "https://www.who.int/";
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI(s));
        }
        catch (Exception e) {
            System.out.println("Exception occured:"+e.getMessage());
        }
    }
}
