public class Truck extends Vehicle{
   private double payloadCapacity;
   
   
   public Truck (String brand, String model, int year, double payloadCapacity){
     super(brand, model, year);
     this.payloadCapacity = payloadCapacity;
   
   }
   
   @Override
   public void displayInfo(){
     super.displayInfo();
     System.out.println("Payload Capacity: " + payloadCapacity + " tons");
   }
   
}