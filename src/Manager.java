
class Manager extends Employee {
    private String department;
 
    public Manager(int employeeID, String name, String designation, double salary, String department) {
        super(employeeID, name, designation, salary);
        this.department = department;
    }
 
    public String getDepartment() {
        return department;
    }
 
    @Override
    public String toString() {
        return super.toString() +
               "\nDepartment: " + department;
    }
}