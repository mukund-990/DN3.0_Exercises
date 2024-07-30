public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee employee1 = new Employee(1, "Mukund kumar jha", "Software Engineer", 50000.0);
        Employee employee2 = new Employee(2, "Sakshi gupta", "Data Scientist", 60000.0);
        Employee employee3 = new Employee(3, "Sid shaw", "Product Manager", 70000.0);

        ems.addEmployee(employee1);
        ems.addEmployee(employee2);
        ems.addEmployee(employee3);

        System.out.println("Employees:");
        ems.traverseEmployees();

        Employee searchedEmployee = ems.searchEmployee(2);
        if (searchedEmployee != null) {
            System.out.println("Searched Employee:");
            System.out.println("Employee ID: " + searchedEmployee.getEmployeeId() + ", Name: " + searchedEmployee.getName() + ", Position: " + searchedEmployee.getPosition() + ", Salary: " + searchedEmployee.getSalary());
        } else {
            System.out.println("Employee not found.");
        }

        ems.deleteEmployee(2);

        System.out.println("Employees after deletion:");
        ems.traverseEmployees();
    }
}