package associationexample.dominio;

public class Student {
    private String name;
    private String email;
    private Course[] courses;

    public Student(String name, String email, Course[] courses) {
        this.name = name;
        this.email = email;
        this.courses = courses;
    }

    public Student(String nome, String email) {
        this.name = nome;
        this.email = email;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
