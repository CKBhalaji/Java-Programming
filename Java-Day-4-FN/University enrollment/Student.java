import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private int studentId;
    private List<Course> completedCourses;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.completedCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void completeCourse(Course course) {
        completedCourses.add(course);
    }

    public boolean hasCompletedCourse(Course course) {
        return completedCourses.contains(course);
    }
}
