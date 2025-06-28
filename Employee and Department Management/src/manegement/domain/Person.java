package manegement.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected String birthDate;

    public Person(String name, String cpf, String birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Birthday Date: "+this.birthDate);
    }

    public void displayInfo(String info){
        switch (info.toLowerCase()){
            case "name":
                System.out.println("Name: "+ this.name);
                break;
            case "cpf":
                System.out.println("Cpf: "+ this.cpf);
                break;
            case "birthdate":
                System.out.println("Birthday Date: "+ this.birthDate);
                break;
            default:
                System.out.println("nothing here");
                break;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
