import java.util.ArrayList;
 
class EmployeeManagementSystem {
    private ArrayList<Employee> employees;
 
    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }
    
  
 
    public ArrayList<Employee> getEmployees() {
		return employees;
	}
 
 
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
 
 
 
	public void addEmployee(Employee employee) {
        employees.add(employee);
    }
 
    public void removeEmployee(int employeeID) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == employeeID) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found.");
    }
 
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
                System.out.println("---------------");
            }
        }
    }
}