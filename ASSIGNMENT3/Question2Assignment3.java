public class Question2Assignment3 {

    // Data members
    private String studentId;
    private String name;
    private int age;
    private String course;
    private double gpa;

    // Constructor
    public Question2Assignment3(String studentId, String name, int age, String course, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    // Methods
    public void enrollCourse(String newCourse) {
        System.out.println(name + " is enrolling in " + newCourse);
        this.course = newCourse;
    }

    public void study() {
        System.out.println(name + " is studying for exams.");
    }

    public void submitAssignment() {
        System.out.println(name + " is submitting an assignment.");
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }

    // Main method
    public static void main(String[] args) {
        // Example usage:
        Question2Assignment3 student = new Question2Assignment3("123", "John Doe", 20, "Computer Science", 3.8);

        student.enrollCourse("Data Structures");
        student.study();
        student.submitAssignment();
        student.displayStudentInfo();
    }
}
