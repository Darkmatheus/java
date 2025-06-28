package manegement.test;

import manegement.domain.*;

public class CompanyTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Marcus", "058.115.282.91", "04/08/2000", "#556777P", 5000.0);
        Employee employee2 = new Employee("Camara", "021.135.232.71", "02/10/1989", "#562627P", 3000.0);
        Employee employee3 = new Employee("Spike", "021.135.232.71", "30/09/1983", "#27247P", 7000.0);
        Employee[] employees = {employee1, employee2, employee3};

        Manager manager = new Manager("Julian", "778.998.998.00", "01/01/1990", "#567323M", 8000.0, 1000.0);

        Department department = new Department("TI", 199, employees, manager);
        Department[] departments = {department};


        Company company = new Company("JAVA COMPANY", departments);

        company.listDepartment();
        department.listEmployee();
        department.listEmployeesFilter(4000.00);

        employee3.displayInfo("salary");
    }
}
