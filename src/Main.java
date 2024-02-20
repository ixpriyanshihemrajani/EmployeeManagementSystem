import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
 
        while (true) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add a new employee");
            System.out.println("2. Remove an employee by ID");
            System.out.println("3. Display details of all employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
 
            int choice = sc.nextInt();
            sc.nextLine();
 
            switch (choice) {
                case 1:
                    
                    System.out.print("Enter employee ID: ");
                    int employeeID = sc.nextInt();
                    sc.nextLine();
                    boolean idExists=false;
                    for(Employee existingEmployee: ems.getEmployees()) {
                    	if(existingEmployee.getEmployeeID()==employeeID) {
                    		idExists=true;
                    		System.out.println("Employee with ID " + employeeID + " already exists. Please choose a different ID.");
                            break;
                    	}
                    }
                    
                    if(!idExists){
                    	System.out.print("Enter name: ");
                        String name = sc.nextLine();
 
                        System.out.print("Enter designation: ");
                        String designation = sc.nextLine();
 
                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();
                        
                        System.out.print("Enter department: ");
                        String department = sc.nextLine();
                        
                        ems.addEmployee(new Manager(employeeID, name, designation, salary, department));
     
                        break;
                    }
 
                case 2:
                    
                    System.out.print("Enter employee ID to remove: ");
                    int removeEmployeeID = sc.nextInt();
                    ems.removeEmployee(removeEmployeeID);
                    break;
 
                case 3:
                    
                    ems.displayAllEmployees();
                    break;
 
                case 4:
                    
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    System.exit(0);
 
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}