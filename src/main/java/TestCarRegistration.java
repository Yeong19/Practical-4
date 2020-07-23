import java.util.Scanner;
public class TestCarRegistration {
    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        CarType []types = { new CarType("TOYOTA", "VIOS", 1.5),
                           new CarType("NISSAN", "TEANA", 2.0),}
                           new CarType("HONDA", "CITY", 1.6),
  	//todo:: create an array that will able to store 6 registrations
        Registration[] registration = new Registration[2];       
        
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < registration.length; ++i) {

  		System.out.println("\nRegistration number: " + Registration.getCount());
  		
                //todo:: request and read the owner detail
                System.out.print("Enter the owner name: ");
                String name = Scanner.nextLine();
                System.out.print("Enter IC number: ");
                String icNo = scanner.nextLine();
                              
                //construct owner object
                 Owner own = new Owner(name, icNo);
                
  		//todo:: request and read car detail
                System.out.print("Enter the plate number: ");
                String plateNo = scanner.nextline();
                System.out.print("Enter the color: ");
                String color = scanner.nexy=tLine();
                System.out.print("Enter the year" );
                int year = scanner.nextInt();

                //construct owner object
                Car car = new Car(PlateNo, color, year);

  		System.out.println("\nCar Types: ");

  		//todo:: display all available carType
               for(int i=0;i < types.length; i++){
                    System.out.printf("%d %s\n", i+1, type[i].toString());
                }   
  		
                System.out.print("\nSelect car type [1.." + types.length+ "]: ");
  		int selection = scanner.nextInt();
                
                //todo:: get cartype from array (based on selection)
              	Car car = new Cae(plateNo, color, year, types[selection-1]);

  		//todo:: register the car
                registration[i] = new Registration(own, car);
                         
  		scanner.nextLine();
  	}
  
  	//todo:: display all registration detail
        displaylisting(registration);

  }
  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
        System.out.println(regArr[i]);
  }
}
