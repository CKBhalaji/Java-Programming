public class UniversityEnrollmentSystem {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20, 101);
        Student student2 = new Student("Bob", 22, 102);

        Course mathCourse = new Course("Math");
        Course physicsCourse = new Course("Physics");

        mathCourse.addPrerequisite(physicsCourse);

        mathCourse.enrollStudent(student1);
        physicsCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        mathCourse.displayEnrolledStudents();
        physicsCourse.displayEnrolledStudents();
    }
}
