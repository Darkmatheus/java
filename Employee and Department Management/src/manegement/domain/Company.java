package manegement.domain;

public class Company {
    private String name;
    private Department[] departments = new Department[5];
    private int departmentCount = 0;

    public Company(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }
    public void addDepartment(Department department){
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
            System.out.println("Ts company has: " + department.getName() + " departments");
        } else {
            System.out.println("nothing here");
        }
    }

    public void listDepartment(){
        System.out.println("\nCompany: "+ name);
        for (Department department : departments) {
            System.out.println("Departments: "+ department.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
