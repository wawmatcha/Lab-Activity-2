public class Motorcycle extends Vehicle implements Serviceable{
   private String engineType;
   
   
   public Motorcycle(String brand, String model, int year, String engineType){
     super(brand, model, year);
     this.engineType = engineType;
   
   }
   
   @Override
   public void displayInfo(){
     super.displayInfo();
     System.out.println("Engine: " + engineType);
   }
  @Override
  public void move(){
  System.out.println("RRRRRNNNGGGG the Motorcyle is moving fast");
}
   
   @Override
    public void service() {
        System.out.println("Motorcycle: Pre inspect tires and brakes.");
     }
   }