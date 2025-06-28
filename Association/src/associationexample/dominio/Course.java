package associationexample.dominio;

public class Course {
    private String name;
    private int duration;
    private Student[] students;
    private Platform platform;

    public Course(String nome, int duration, Student[] students, Platform platform) {
        this.name = nome;
        this.duration = duration;
        this.students = students;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
}
