 
package map;

import java.util.ArrayList;
import java.util.List;

 
public class City {
    public String name;
    public int distance;
    List<City> neighbors=new ArrayList<>();
    
    public City(String name, int distance){
        this.name=name;
        this.distance=distance;
    }
    
   public City add_neighbor(City c){ //add neighbor to ArrayList 
       neighbors.add(c);
       return this;
   }
   
   public void show(){  //show city and neighbors 
       System.out.println("City name :"+name);
       for (int i = 0; i < neighbors.size(); i++) {
           System.out.println("neighbor "+i+" : "+neighbors.get(i).name+" distance :"+neighbors.get(i).distance);
           
       }
   }
   
    
    
}
