package associationexample.dominio;

public class Platform {
    private String name;
    private String site;
    private Course[] courses;

    public Platform(String name, String site, Course[] courses) {
        this.name = name;
        this.site = site;
        this.courses = courses;
    }

    public Platform(String nome, String site) {
        this.name = nome;
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
