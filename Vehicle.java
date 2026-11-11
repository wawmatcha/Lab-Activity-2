public abstract class Vehicle {

 private String brand;
 private String model;
 private int year;
 
 public Vehicle(String brand, String model, int year){
  this.brand = brand;
  this.model = model;  
  this.year = year; 
  }
 
 public void displayInfo(){
 System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);
 }
 
 public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }

    public abstract void move();
 }