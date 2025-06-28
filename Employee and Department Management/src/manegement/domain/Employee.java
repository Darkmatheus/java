package manegement.domain;

public class Employee extends Person {
    protected String employeeID;
    protected double salary;
    private Department department;

    public Employee(String name, String cpf, String birthDate, String employeeID, double salary) {
        super(name, cpf, birthDate);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID: "+this.employeeID);
        System.out.println("Salary: "+this.salary);
    }

    @Override
    public void displayInfo(String info){
        switch (info.toLowerCase()){

            case "salary":
                System.out.println("\n(from switch)Salary from  "+ this.name + ": "+ this.salary);
                break;
            case "employee id":
                System.out.println("Employee ID: "+this.employeeID);
                break;
            default:
                super.displayInfo(info);
                break;
        }

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}