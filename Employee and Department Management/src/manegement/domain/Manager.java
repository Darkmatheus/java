package manegement.domain;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String cpf, String birthDate, String employeeID, double salary, double bonus) {
        super(name, cpf, birthDate, employeeID, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+ this.bonus);
    }

    @Override
    public void displayInfo(String info){
        switch(info.toLowerCase()) {
            case "bonus":
            System.out.println("Bonus: " + this.bonus);
                break;
            default:
            super.displayInfo(info);
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
