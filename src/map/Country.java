 
package map;

import java.util.ArrayList;
import java.util.List;

 
public class Country {
    public String name;
    List<City> cities=new ArrayList<>();
    
    public Country(String name){
        this.name=name;
    }
    
    public Country add_city(City c){ //add city to arrayList 
        cities.add(c);
        return this;
    }
    
    public void show(){ // show country and cities 
        System.out.println("Country name :"+name);
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i).name+" , ");
        }
    }
    
}
