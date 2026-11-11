public class Car extends Vehicle implements Serviceable{
  private int numberOfDoors;
  
  
  public Car(String brand, String model, int year, int numberOfDoors){
     super(brand, model, year);
     this.numberOfDoors = numberOfDoors;
  
  }
  
  @Override
  public void displayInfo(){
  super.displayInfo();
  System.out.println("Doors: " + numberOfDoors);
  }
  
  @Override
  public void move(){
  System.out.println("Beep Beep the car is moving");
  }
    
  @Override
    public void service() {
        System.out.println("Car: OOps ooopss check oil and brakes.");
  
}

}
