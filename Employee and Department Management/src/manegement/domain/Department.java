package manegement.domain;

public class Department {
    protected String name;
    private double code;
    private Employee[] employees = new Employee[5];
    private Manager manager;
    private int employeeCount = 0;

    public Department(String name, double code, Employee[] employees, Manager manager) {
        this.name = name;
        this.code = code;
        this.employees = employees;
        this.manager = manager;
        this.employeeCount = employees.length;
    }


    public void addEmployee(Employee employee){
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
            System.out.println("Employee: " + employee.getName() + " added to department");
        } else {
            System.out.println("nothing here");
        }
    }

    public void listEmployee(){
        System.out.println("\nDepartment: "+ name+" (Code: "+ code + ")");
        System.out.println("Manager: ");
        manager.displayInfo();
        System.out.println("\nEmployess: ");
        for (Employee employee : employees) {
           if(employee != null) {
               employee.displayInfo();
               System.out.println("-----");
           }
        }
    }

    public void listEmployeesFilter(double filterSalary){
        System.out.println("Employees wt salary above $"+filterSalary+":");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > filterSalary) {
                System.out.println(employee.getName() + " $" + employee.getSalary());
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }
}
