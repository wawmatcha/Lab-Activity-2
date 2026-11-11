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
   
   @Override
    public void moveForward() {
        System.out.println("The truck moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The truck moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("The truck moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("The truck moves right");
    }

}