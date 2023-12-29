import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Course> prerequisites;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.prerequisites = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addPrerequisite(Course prerequisite) {
        prerequisites.add(prerequisite);
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void enrollStudent(Student student) {
        if (hasCompletedPrerequisites(student)) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " has been enrolled in " + courseName);
        } else {
            System.out.println(student.getName() + " cannot be enrolled in " + courseName +
                    ". Prerequisites not completed.");
        }
    }

    private boolean hasCompletedPrerequisites(Student student) {
        for (Course prerequisite : prerequisites) {
            if (!student.hasCompletedCourse(prerequisite)) {
                return false;
            }
        }
        return true;
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }
}
