package associationexample.test;


import associationexample.dominio.Student;
import associationexample.dominio.Course;
import associationexample.dominio.Instructor;
import associationexample.dominio.Platform;

public class AssociationTest {
    public static void main(String[] args) {

        Student student1 = new Student("Matheus", "mhmbprota@gmail.com");
        Student student2 = new Student("Donnie Darko", "donniedarko@rabbit.com");
        Student[] studentsCourse = {student1, student2};

        Platform platform = new Platform("Library", "library.com");

        Course course = new Course("Literature course", 2, studentsCourse, platform);
        Course[] doneCourses = {course};

        Instructor instrutor = new Instructor("Jiraiya", "Literature", doneCourses);

        instrutor.setCourses(doneCourses);
        student1.setCourses(doneCourses);
        student2.setCourses(doneCourses);

        instrutor.print();
    }
}
