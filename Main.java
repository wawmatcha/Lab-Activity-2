public class Main {

   // Helper Serviceable items
   public static void performService(Serviceable item){
     item.service(); 
   } 
    
    // REQUIRED: Method accepting polymorphic parameter
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());
        vehicle.move();
    }

    public static void main(String[] args) {
        
        // DEMO 1: A parent reference holding a child object
        Vehicle vehicle = new Car("Toyota", "Vios", 2026, 4);
        vehicle.displayInfo();
        System.out.println();

        // 1.1 The same variable now refers to a Motorcycle object.
        vehicle = new Motorcycle("Honda", "XRM", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        // 1.2 refers to a TRUCK OBJECT
        vehicle = new Truck("Ford", "F-150", 2026, 3.5);
        vehicle.displayInfo();
        System.out.println();


        // DEMO 2: One method accepts different Vehicle subclasses
        System.out.println("--- 2. Method Parameter ---");
        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motor = new Motorcycle("NMAX", "V3", 2026, "Matic");
        Truck truck = new Truck("Isuzu", "NPR", 2025, 5.0);

        printDetails(car);
        System.out.println();
        printDetails(motor);
        System.out.println();
        printDetails(truck);
        System.out.println();


        // DEMO 3: One array holds different Vehicle subclasses (Polymorphic Array)
        System.out.println("--- 3. Polymorphic Array ---");
        Vehicle[] vehicles = {
            new Car("Tesla", "Roadster", 2026, 4),
            new Motorcycle("NMAX", "V3", 2026, "Matic"),
            new Truck("Volvo", "FH16", 2026, 18.0)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
        
        System.out.println("--- 4. Serviceable Items Array ---");
        Printer printer = new Printer();
        Serviceable[] serviceableItems = { car, motor, truck, printer };
        
        for (Serviceable item : serviceableItems) {
            performService(item);
        }
        
        System.out.println();
    }
    
    
}