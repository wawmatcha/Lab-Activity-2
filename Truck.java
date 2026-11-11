public class Truck extends Vehicle implements Serviceable{
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

   @Override
    public void move(){
    System.out.println("HONNNK HOONK Truck kun is moving heavy load");
}
   
   @Override
    public void service() {
        System.out.println("Truck: Bosseng inspect cargo brakes muna.");

}
}