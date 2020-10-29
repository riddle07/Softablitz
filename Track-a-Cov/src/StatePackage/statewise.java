/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePackage;


public class statewise {
    
private String state;
private String confirmed;
private String recovered;
private String deaths;
private String active;

public void setState(String state){
    this.state = state;
}
public String getState(){
    return state;
}
public void setConfirmed(String confirmed){
    this.confirmed = confirmed;
}
public String getConfirmed(){
    return confirmed;
}
public void setRecovered(String recovered){
    this.recovered = recovered;
}
public String getRecovered(){
    return recovered;
}
public void setDeaths(String deaths){
    this.deaths = deaths;
}
public String getDeaths(){
    return deaths;
}
public void setActive(String active){
    this.active = active;
}
public String getActive(){
    return active;
}
}

