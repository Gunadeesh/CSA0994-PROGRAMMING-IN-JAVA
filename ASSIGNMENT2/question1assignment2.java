public class question1assignment2 {

    public static void main(String[] args) {
        // Given information
        int totalStudents = 90;
        int boys = 45;
        double gradeAPercentage = 50.0;
        int gradeABoys = 20;

        // Calculate the total number of students getting grade 'A'
        int gradeAStudents = (int) ((gradeAPercentage / 100) * totalStudents);

        // Calculate the total number of girls getting grade 'A'
        int gradeAGirls = gradeAStudents - gradeABoys;

        // Print the result
        System.out.println("Total number of girls getting grade 'A': " + gradeAGirls);
    }
}
