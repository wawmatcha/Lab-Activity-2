public class Main {

  public static void main (String [] args){
  
   Vehicle v1 = new Vehicle("PORSCHE", "Taycan", 2023);
   Vehicle v2 = new Vehicle("TOYOTA", "RAV4 Hybrid", 2022);     
   Vehicle v3 = new Vehicle("FORD", "Mustang Fastback", 1967);
   
       //v1
       v1.displayInfo();
       System.out.println("Age:" + v1.calculateAge());
       System.out.println("Vintage?: " + v1.isVintage());
       System.out.println();
        
        
       //v2
       v2.displayInfo();
       System.out.println("Age:" + v2.calculateAge());
       System.out.println("Vintage?: " + v2.isVintage());
       System.out.println();
        
        
       //v3
       v3.displayInfo();
       System.out.println("Age:" + v3.calculateAge());
       System.out.println("Vinatge?: " + v3.isVintage());
       System.out.println();
       
       
       //Setting year test
       boolean result1 = v1.setYear(2000);
       System.out.println("setYear(2000) --- Return: " + result1 +
                          "; year is " + v1.getYear() +
                          "; age " + v1.calculateAge() +
                          "; vintage " + v1.isVintage());
                          
       
       
       boolean result2 = v1.setYear(1885);
       System.out.println("setYear(1885) --- Return: " + result2 +
                          "; year remains " + v1.getYear());
                   
                   
    
       boolean result3 = v1.setYear(2027);
       System.out.println("setYear(2027) --- Return: " + result3 +
                          "; year remains " + v1.getYear());

       System.out.println();
       
       
       
       //Testing constructor validation
       Vehicle v4 = new Vehicle("Test Brand", "Test Model", 1885);
       System.out.println("New vehicle with year 1885\n Initial year is: " + v4.getYear());
       
       
       Vehicle v5 = new Vehicle("Test Brand", "Test Model", 2027);
       System.out.println("New vehicle with year 2027\n Initial year is: " + v5.getYear());
       

            
       
  
  }
  




}