 
package map;

/**
 * @author HASAN NASER
 */
public class Map {

    public static void main(String[] args) {
        Country country1=new Country("Romania");
        country1.add_city(new City("Arad",0))
                .add_city(new City("Zerind",0))
                .add_city(new City("Oradea",0))
                .add_city(new City("Sibiu",0))
                .add_city(new City("Timisoara",0))
                .add_city(new City("Lugoj",0))
                .add_city(new City("Mehadia",0))
                .add_city(new City("Dobreta",0))
                .add_city(new City("Craiova",0))
                .add_city(new City("Rimnicu Vilcea",0))
                .add_city(new City("Pitesti ",0))
                .add_city(new City("Fagaras",0))
                .add_city(new City("Bucharest",0))
                .add_city(new City("Giurgiu",0))
                .add_city(new City("Urziceni",0))
                .add_city(new City("Hirsova",0))
                .add_city(new City("Eforia",0))
                .add_city(new City("Vaslui",0))
                .add_city(new City("Lasi",0))
                .add_city(new City("Neamt",0));
        
       //country1.show();
         country1.cities.get(0).add_neighbor(new City("Zerind",75))
                               .add_neighbor(new City("Sibiu",140))
                               .add_neighbor(new City("Timisoara",118));
         
         country1.cities.get(1).add_neighbor(new City("Arad",75))
                               .add_neighbor(new City("Oradia",71));
         
         country1.cities.get(2).add_neighbor(new City("Zerind",71))
                               .add_neighbor(new City("Sibiu",151));
         
         country1.cities.get(3).add_neighbor(new City("Oradea",151))
                               .add_neighbor(new City("Arad",140))
                               .add_neighbor(new City("Rimnicu Vilcea",80))
                               .add_neighbor(new City("fagaras",99));
         
         country1.cities.get(4).add_neighbor(new City("Lugoj",111))
                               .add_neighbor(new City("Arad",118));
         
         country1.cities.get(5).add_neighbor(new City("Timisoara",111))
                               .add_neighbor(new City("Mehadia",70));
         
         country1.cities.get(6).add_neighbor(new City("Lugoj",70))
                               .add_neighbor(new City("Dobreta",75));
         
         country1.cities.get(7).add_neighbor(new City("Craivo",120))
                               .add_neighbor(new City("Mehadia",75));
         
         country1.cities.get(8).add_neighbor(new City("Dobreta",120))
                               .add_neighbor(new City("Rimnicu Vilcea",146))
                               .add_neighbor(new City("Pitesti",138));
         
         country1.cities.get(9).add_neighbor(new City("Pitesti",97))
                               .add_neighbor(new City("Craivo",146))
                               .add_neighbor(new City("Sibiu",80));
         
         country1.cities.get(10).add_neighbor(new City("Rimnicu Vilcea",97))
                               .add_neighbor(new City("Craivo",138))
                               .add_neighbor(new City("Bucharest",101));
         
         country1.cities.get(11).add_neighbor(new City("Sibiu",99))
                               .add_neighbor(new City("Bucharest",211));
         
          country1.cities.get(12).add_neighbor(new City("Fagaras",211))
                               .add_neighbor(new City("Pitesti",101))
                               .add_neighbor(new City("Giurgiu",90))
                               .add_neighbor(new City("Urziceni",85));
          
           country1.cities.get(13).add_neighbor(new City("Bucharest",90));
           
           country1.cities.get(14).add_neighbor(new City("Bucharest",85))
                               .add_neighbor(new City("Hirsova",98))
                               .add_neighbor(new City("Vaslui",142));
           
            country1.cities.get(15).add_neighbor(new City("Eforia",86))
                               .add_neighbor(new City("Urziceni",98));
          
            
            country1.cities.get(16).add_neighbor(new City("Hirsova",86));
            
            country1.cities.get(17).add_neighbor(new City("Urziceni",142))
                               .add_neighbor(new City("Lasi",92));
         
            country1.cities.get(18).add_neighbor(new City("Vaslui",142))
                               .add_neighbor(new City("Neamt",87));
            
            country1.cities.get(19).add_neighbor(new City("Lasi",87));
                               
         
         country1.show();
         System.out.println("");
         country1.cities.get(1).show();
                 
                                    
    }
    
}
