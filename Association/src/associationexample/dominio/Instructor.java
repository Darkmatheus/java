package associationexample.dominio;

public class Instructor {
    private String name;
    private String areaAction;
    private Course[] courses;

    public Instructor(String name, String areaAction, Course[] courses) {
        this.name = name;
        this.areaAction = areaAction;
        this.courses = courses;
    }

    public void print() {
        System.out.println();
        System.out.println("Course instructor: " + this.name);
        System.out.println("Acts in: " + this.areaAction +'\n');

        if (this.courses == null) return;
        for (Course curso : this.courses) {
            System.out.println("Course: " + curso.getName());
            System.out.println("Duration: " +curso.getDuration() + " months");

        if(curso.getPlatform() != null){
            System.out.println("Platform: "+ curso.getPlatform().getName());
            System.out.println("Site: "+ curso.getPlatform().getSite());
        }

        if(curso.getStudents() != null){
            System.out.println("\nStudents: ");
            for (Student aluno : curso.getStudents()) {
                System.out.println(aluno.getNome() +"\ne-mail: " + aluno.getEmail() +'\n');
            }
        }
      }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaAction() {
        return areaAction;
    }

    public void setAreaAction(String areaAction) {
        this.areaAction = areaAction;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}