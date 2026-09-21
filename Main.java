public class Main {

  public static void main (String [] args){
  
    Vehicle v1 = new Vehicle();

        v1.brand = "PORSCHE";
        v1.model = "Taycan";
        v1.year = 2023;
        
        v1.displayInfo();
        System.out.println("Age:" + v1.calculateAge());
        System.out.println("Vintage?: " + v1.isVintage());
        System.out.println();
        
        
     Vehicle v2 = new Vehicle();
  
        v2.brand = "TOYOTA";
        v2.model = "RAV4 Hybrid";
        v2.year = 2022;
        
        v2.displayInfo();
        System.out.println("Age:" + v2.calculateAge());
        System.out.println("Vintage?: " + v2.isVintage());
        System.out.println();
        
     
      Vehicle v3 = new Vehicle();
  
        v3.brand = "FORD";
        v3.model = "Mustang Fastback";
        v3.year =  1967;
        
        v3.displayInfo();
        System.out.println("Age:" + v3.calculateAge());
        System.out.println("Vinatge?: " + v3.isVintage());
        System.out.println();
    
   

  
  }
  




}