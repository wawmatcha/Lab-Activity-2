public class Main {

  public static void main (String [] args){
  
   Vehicle v1 = new Vehicle("PORSCHE", "Taycan", 2023);
        
        v1.displayInfo();
        System.out.println("Age:" + v1.calculateAge());
        System.out.println("Vintage?: " + v1.isVintage());
        System.out.println();
        
        
     Vehicle v2 = new Vehicle("TOYOTA", "RAV4 Hybrid", 2022);
          
        v2.displayInfo();
        System.out.println("Age:" + v2.calculateAge());
        System.out.println("Vintage?: " + v2.isVintage());
        System.out.println();
        
     
      Vehicle v3 = new Vehicle("FORD", "Mustang Fastback", 1967);
        
        v3.displayInfo();
        System.out.println("Age:" + v3.calculateAge());
        System.out.println("Vinatge?: " + v3.isVintage());
        System.out.println();
    
   

  
  }
  




}