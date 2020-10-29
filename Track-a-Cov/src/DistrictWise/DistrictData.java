
package DistrictWise;

public class DistrictData {
    private String name;
    private String confirmed;
    private String recovered;
    private String deaths;
    public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
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
}
